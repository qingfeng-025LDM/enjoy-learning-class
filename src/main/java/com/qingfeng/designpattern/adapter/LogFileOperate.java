package com.qingfeng.designpattern.adapter;

import java.io.*;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {

    /**
     * 日志文件的路径和文件名称，默认是当前项目根下的AdapterLog.log
     */
    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName){
        if (logFilePathName != null && logFilePathName.trim().length() > 0){
            this.logFilePathName = logFilePathName;
        }
    }

    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream ois = null;
        try {
            File file = new File(logFilePathName);
            if (file.exists()){
                ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>)ois.readObject();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (ois != null){
                    ois.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return list;
    }

    public void writeLogFile(List<LogModel> list) {
        File file = new File(logFilePathName);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oos.writeObject(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (oos != null){
                    oos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
