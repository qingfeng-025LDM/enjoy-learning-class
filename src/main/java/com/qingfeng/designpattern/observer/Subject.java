package com.qingfeng.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    /**
     * 保存注册的observer
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 注册
     * @param observer
     */
    public void attach(Observer observer){
        observerList.add(observer);
    }

    /**
     * 删除
     * @param observer
     */
    public void delete(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 通知观察者
     */
    protected void notifyObserver(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

}
