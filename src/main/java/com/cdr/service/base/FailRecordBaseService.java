package com.cdr.service.base;

import com.cdr.mapper.FailRecordMapper;
import com.cdr.model.FailRecord;
import com.cdr.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by nope-J on 2016/10/17.
 */
public class FailRecordBaseService implements IService<FailRecord> {
    @Autowired
    private FailRecordMapper mapper;

    @Override
    public FailRecord selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public int save(FailRecord entity) {
        return mapper.insert(entity);
    }

    @Override
    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int updateAll(FailRecord entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateNotNull(FailRecord entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<FailRecord> selectByExample(Object example) {
        return mapper.selectByCondition(example);
    }
}
