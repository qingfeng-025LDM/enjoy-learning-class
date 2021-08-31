package com.qingfeng.designpattern.singleton;

public class Client {

    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        String paramA = appConfig.getParamA();
        String paramB = appConfig.getParamB();

        System.out.println("paramA="+paramA + ", paramB=" + paramB);
    }

}
