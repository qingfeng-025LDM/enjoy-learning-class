package com.qingfeng.designpattern.observer;

import java.util.Observable;

public class NewsPaper1 extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        this.setChanged();

        //推的方式
        this.notifyObservers(this.content);

        //拉的方式
        this.notifyObservers();
    }
}
