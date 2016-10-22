package com.cdr.service.impl;

import com.cdr.model.FailRecord;
import com.cdr.service.CdrService;
import com.cdr.service.IService;
import com.cdr.util.RetryFailCdr;
import com.cdr.util.WriteCdr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Service
public class CdrServiceImpl implements CdrService {
    private int threadPoolSize = 5;


    @Override
    public void createCdr(List<String> fileNames) {
        try {
            Executor executor = Executors.newFixedThreadPool(5);
            ApplicationContext ac = new FileSystemXmlApplicationContext("classPath:spring/spring-core.xml");
            IService cdrBaseService = (IService) ac.getBean("cdrBaseService");
            IService successRecordBaseService = (IService) ac.getBean("successRecordBaseService");
            IService failedRecordBaseService = (IService) ac.getBean("failRecordBaseService");
            if (fileNames!=null && fileNames.size() > 0) {
                for (int i = 0; i < fileNames.size(); i++) {
                    WriteCdr writeCdr = new WriteCdr(fileNames.get(i), cdrBaseService, successRecordBaseService, failedRecordBaseService);
                    executor.execute(writeCdr);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void retryFailCdr(List<FailRecord> list) {
        try {
            Executor executor = Executors.newFixedThreadPool(5);
            ApplicationContext ac = new FileSystemXmlApplicationContext("classPath:spring/spring-core.xml");
            IService cdrBaseService = (IService) ac.getBean("cdrBaseService");
            IService successRecordBaseService = (IService) ac.getBean("successRecordBaseService");
            IService failedRecordBaseService = (IService) ac.getBean("failRecordBaseService");
            if (list!=null && list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    RetryFailCdr retryFailCdr = new RetryFailCdr(list.get(i), cdrBaseService, successRecordBaseService, failedRecordBaseService);
                    executor.execute(retryFailCdr);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
