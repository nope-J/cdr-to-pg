package com.cdr.controller;
;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "cdr/")
public class CdrController {

    @RequestMapping(value = "start")
    public ModelAndView starter(){
        System.out.println("starter-----------------------------------");
//        CdrHandleRecord latestCdrHandleRecord = cdrHandleRecordService.getLatestHandleRecord();
//        List<String> list = new ArrayList<>();
//        if (latestCdrHandleRecord != null){
//            String fromKeyStr = latestCdrHandleRecord.getFileKey();
//
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//            Date date = new Date();
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(date);
//            calendar.add(Calendar.DAY_OF_MONTH, -1);
//            date = calendar.getTime();
//            String toKeyStr = sdf.format(date);
//            int fromKey = Integer.parseInt(fromKeyStr);
//            int toKey = Integer.parseInt(toKeyStr);
//            while(fromKey < toKey){
//                try {
//                    Date fromDate = sdf.parse(""+fromKey);
//                    calendar.setTime(fromDate);
//                    calendar.add(Calendar.DAY_OF_MONTH, 1);
//                    fromDate = calendar.getTime();
//                    fromKeyStr = sdf.format(fromDate);
//                    fromKey = Integer.parseInt(fromKeyStr);
//                    List<String> stringList = FtpUtils.getFileNames(fromKeyStr);
//                    if (stringList != null){
//                        list.addAll(stringList);
//                    }
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//            }
//        }else {
//            list = FtpUtils.getAllFileNames();
//        }
//        String[] remoteFileNames = new String[list.size()];
//        for (int i=0;i<list.size();i++){remoteFileNames[i] = remotePath + list.get(i);
//        }
//        FtpUtils.loadFiles(remoteFileNames,localPath);
//        cdrService.createCdr(list);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.add(Calendar.DAY_OF_MONTH, -1);
//        date = calendar.getTime();
//        String fileKey = sdf.format(date);
//
//        CdrHandleRecord cdrHandleRecord = new CdrHandleRecord();
//        cdrHandleRecord.setFileKey(fileKey);
//        cdrHandleRecord.setCreateTime(new Date());
//        cdrHandleRecordService.createCdrHandleRecord(cdrHandleRecord);

        return new ModelAndView("/addMissingCdr.jsp");
    }

    @RequestMapping(value = "addMissing")
    public ModelAndView addMissingCdr(String fileKey){
//        List<String> list = FtpUtils.getFileNames(fileKey);
//        String[] remoteFileNames = new String[list.size()];
//        for (int i=0;i<list.size();i++){
//            remoteFileNames[i] = remotePath + list.get(i);
//        }
//
//        FtpUtils.loadFiles(remoteFileNames,localPath);
//        cdrService.createCdr(list);
        return new ModelAndView("/addMissingCdr.jsp");
    }
}
