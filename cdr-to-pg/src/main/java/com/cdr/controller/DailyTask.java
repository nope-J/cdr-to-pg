package com.cdr.controller;

import com.cdr.mapper.CdrHandleRecordMapper;
import com.cdr.model.CdrHandleRecord;
import com.cdr.service.CdrService;
import com.cdr.util.FtpUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by nope-J on 2016/10/17.
 */
public class DailyTask {
    private String localPath="E:/DAT";

    private String remotePath = "/home/tmp/cdr/";

    @Autowired
    private CdrService cdrService;

    @Autowired
    private CdrHandleRecordMapper cdrHandleRecordMapper;

    public void dayTask() {
        System.out.println("dailyTask++++++++++++++++++++++");
//      获取插入记录的下一天
        CdrHandleRecord latestCdrHandleRecord = cdrHandleRecordMapper.selectLatestHandleRecord();
        String dateStr = latestCdrHandleRecord.getFileKey();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        date = calendar.getTime();
        String fileKey = sdf.format(date);
        List<String> list = FtpUtils.getFileNames(fileKey);
        String[] remoteFileNames = new String[list.size()];
        for (int i=0;i<list.size();i++){
            remoteFileNames[i] = remotePath + list.get(i);
        }

        FtpUtils.loadFiles(remoteFileNames,localPath);
        cdrService.createCdr(list);

        //记录最后操作日期，最新操作日期加一
        CdrHandleRecord cdrHandleRecord = new CdrHandleRecord();
        cdrHandleRecord.setFileKey(fileKey);
        cdrHandleRecord.setCreateTime(new Date());
        cdrHandleRecordMapper.insert(cdrHandleRecord);
    }
}
