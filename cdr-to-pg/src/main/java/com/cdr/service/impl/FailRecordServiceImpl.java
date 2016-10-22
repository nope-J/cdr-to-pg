package com.cdr.service.impl;

import com.cdr.model.FailRecord;
import com.cdr.service.BaseService;
import com.cdr.service.FailRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nope-J on 2016/10/13.
 */
@Service
public class FailRecordServiceImpl extends BaseService<FailRecord> implements FailRecordService {
    @Override
    public List<FailRecord> listFailedFile() {
        return selectAll();
    }

    @Override
    public int deleteFailedFile(int id) {
        return delete(id);
    }


}
