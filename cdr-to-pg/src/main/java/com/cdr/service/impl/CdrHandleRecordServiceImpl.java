package com.cdr.service.impl;

import com.cdr.mapper.CdrHandleRecordMapper;
import com.cdr.model.CdrHandleRecord;
import com.cdr.service.BaseService;
import com.cdr.service.CdrHandleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nope-J on 2016/10/14.
 */
@Service
public class CdrHandleRecordServiceImpl extends BaseService<CdrHandleRecord> implements CdrHandleRecordService {
    @Autowired
    private CdrHandleRecordMapper cdrHandleRecordMapper;

    @Override
    public int createCdrHandleRecord(CdrHandleRecord cdrHandleRecord) {
        return save(cdrHandleRecord);
    }

    @Override
    public CdrHandleRecord getLatestHandleRecord() {
        return cdrHandleRecordMapper.selectLatestHandleRecord();
    }

}
