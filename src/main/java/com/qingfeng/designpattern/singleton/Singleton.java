package com.qingfeng.designpattern.singleton;

public class Singleton {

    private volatile static Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //类级内部类
    static class A{

    }

    //对象级内部类
    class B{

    }
}
