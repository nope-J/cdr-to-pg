package com.cdr.service;

import com.cdr.model.CdrHandleRecord;

/**
 * Created by nope-J on 2016/10/14.
 */
public interface CdrHandleRecordService extends IService<CdrHandleRecord> {
    int createCdrHandleRecord(CdrHandleRecord cdrHandleRecord);

    CdrHandleRecord getLatestHandleRecord();
}
