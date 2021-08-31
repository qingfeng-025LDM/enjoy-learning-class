package com.qingfeng.designpattern.observer;

public class NewsPaper extends Subject {

    //报纸的具体内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        this.notifyObserver();
    }
}
