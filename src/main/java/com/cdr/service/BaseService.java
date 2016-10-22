package com.cdr.service;

import com.cdr.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T>{

    @Autowired
    protected BaseMapper<T> mapper;

    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public List<T> selectAll(){return mapper.selectAll();}

    public List<T> selectByExample(Object example) {
        return null;
    }
    //TODO 其他...
}
