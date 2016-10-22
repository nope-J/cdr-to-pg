package com.cdr.service.base;

import com.cdr.mapper.SuccessRecordMapper;
import com.cdr.model.SuccessRecord;
import com.cdr.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by nope-J on 2016/10/12.
 */
public class SuccessRecordBaseService implements IService<SuccessRecord> {

    @Autowired
    protected SuccessRecordMapper mapper;

    @Override
    public SuccessRecord selectByKey(Object key) {
        return null;
    }

    @Override
    public int save(SuccessRecord entity) {
        return mapper.insert(entity);
    }

    @Override
    public int delete(Object key) {
        return 0;
    }

    @Override
    public int updateAll(SuccessRecord entity) {
        return 0;
    }

    @Override
    public int updateNotNull(SuccessRecord entity) {
        return 0;
    }

    @Override
    public List<SuccessRecord> selectByExample(Object example) {
        return null;
    }
}
