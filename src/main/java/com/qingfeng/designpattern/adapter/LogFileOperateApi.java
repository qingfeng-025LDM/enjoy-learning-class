package com.qingfeng.designpattern.adapter;

import java.util.List;

public interface LogFileOperateApi {

    List<LogModel> readLogFile();

    void writeLogFile(List<LogModel> list);
}
