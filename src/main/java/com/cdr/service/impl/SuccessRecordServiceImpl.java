package com.cdr.service.impl;

import com.cdr.model.SuccessRecord;
import com.cdr.service.BaseService;
import com.cdr.service.SuccessRecordService;
import org.springframework.stereotype.Service;

/**
 * Created by nope-J on 2016/10/13.
 */
@Service
public class SuccessRecordServiceImpl extends BaseService<SuccessRecord> implements SuccessRecordService {
    @Override
    public int createSuccessRecord(SuccessRecord successRecord) {
        return save(successRecord);
    }
}
