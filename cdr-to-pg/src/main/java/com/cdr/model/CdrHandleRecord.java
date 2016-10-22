package com.cdr.model;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by nope-J on 2016/10/14.
 */
public class CdrHandleRecord implements Serializable{
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    //存年月日如20160809，从表中查询最大id知道最新备份是哪天
    private String fileKey;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
