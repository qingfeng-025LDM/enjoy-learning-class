package com.qingfeng.designpattern.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static AppConfig instance = new AppConfig();

    public static AppConfig getInstance(){
        return instance;
    }

    private String paramA;
    private String paramB;

    public String getParamA() {
        return paramA;
    }

    public String getParamB() {
        return paramB;
    }

    private AppConfig(){
        readConfig();
    }

    public void readConfig(){

        Properties properties = new Properties();
        InputStream is = null;

        try {
            is = AppConfig.class.getResourceAsStream("appConfig.properties");
            properties.load(is);
            this.paramA = properties.getProperty("paramA");
            this.paramB = properties.getProperty("paramB");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
