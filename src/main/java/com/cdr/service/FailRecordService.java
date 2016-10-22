package com.cdr.service;

import com.cdr.model.FailRecord;

import java.util.List;

/**
 * Created by nope-J on 2016/10/13.
 */
public interface FailRecordService {
    List<FailRecord> listFailedFile();
    int deleteFailedFile(int id);
}
