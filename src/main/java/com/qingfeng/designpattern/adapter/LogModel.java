package com.qingfeng.designpattern.adapter;

import java.io.Serializable;
import java.util.Date;

public class LogModel implements Serializable {

    private String id;

    //操作用户
    private String operateUser;

    //操作时间
    private String operateDate;

    //日志内容
    private String logContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    @Override
    public String toString() {
        return "LogModel{" +
                "id='" + id + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", operateDate='" + operateDate + '\'' +
                ", logContent='" + logContent + '\'' +
                '}';
    }
}
