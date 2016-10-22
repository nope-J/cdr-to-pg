package com.cdr.service.base;

import com.cdr.mapper.CdrMapper;
import com.cdr.model.Cdr;
import com.cdr.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CdrBaseService implements IService<Cdr> {
    @Autowired
    protected CdrMapper mapper;

    @Override
    public Cdr selectByKey(Object key) {
        return null;
    }

    @Override
    public int save(Cdr entity) {
        return mapper.insert(entity);
    }

    @Override
    public int delete(Object key) {
        return 0;
    }

    @Override
    public int updateAll(Cdr entity) {
        return 0;
    }

    @Override
    public int updateNotNull(Cdr entity) {
        return 0;
    }

    @Override
    public List<Cdr> selectByExample(Object example) {
        return null;
    }
}
