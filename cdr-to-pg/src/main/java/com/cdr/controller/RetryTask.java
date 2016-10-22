package com.cdr.controller;

import com.cdr.model.FailRecord;
import com.cdr.service.CdrService;
import com.cdr.service.FailRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nope-J on 2016/10/14.
 */

public class RetryTask {
    @Autowired
    private FailRecordService failRecordService;

    @Autowired
    private CdrService cdrService;

    public void retryFailTask(){
        System.out.println("retryTask------------------------");
        List<FailRecord> list = failRecordService.listFailedFile();
        List<String> fileNames = new ArrayList<>();
        for (int i=0;i<list.size();i++){
            fileNames.add(list.get(i).getFileName());
        }
        cdrService.retryFailCdr(list);

        for (int i=0;i<list.size();i++){
            failRecordService.deleteFailedFile(list.get(i).getId());
        }
    }
}
