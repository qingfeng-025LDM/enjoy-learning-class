package com.qingfeng.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Reader1 implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "获取订阅的信息：" + arg);

        System.out.println(name + "获取订阅的信息：" + ((NewsPaper1)o).getContent());
    }
}
