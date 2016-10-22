package com.cdr.service;

import com.cdr.model.FailRecord;

import java.util.List;

public interface CdrService {
    void createCdr(List<String> fileNames);
    void retryFailCdr(List<FailRecord> list);
}
