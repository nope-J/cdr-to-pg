package com.cdr.mapper;

import com.cdr.model.CdrHandleRecord;
import org.springframework.stereotype.Component;

/**
 * Created by nope-J on 2016/10/14.
 */
@Component
public interface CdrHandleRecordMapper extends BaseMapper<CdrHandleRecord> {
    CdrHandleRecord selectLatestHandleRecord();
}
