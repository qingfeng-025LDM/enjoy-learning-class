package com.qingfeng.designpattern.adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        LogModel log1 = new LogModel();
        log1.setId("001");
        log1.setOperateUser("admin");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        log1.setOperateDate(sdf.format(new Date()));
        log1.setLogContent("这是一个测试！");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(log1);

        LogFileOperate logFileOperate = new LogFileOperate("");

        logFileOperate.writeLogFile(list);

        List<LogModel> readLogs = logFileOperate.readLogFile();
        System.out.println(readLogs);
    }
}
