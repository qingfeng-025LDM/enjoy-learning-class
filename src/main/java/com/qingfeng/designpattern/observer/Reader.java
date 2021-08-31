package com.qingfeng.designpattern.observer;

public class Reader implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到报纸了，阅读它，内容为：" + ((NewsPaper)subject).getContent());
    }
}
