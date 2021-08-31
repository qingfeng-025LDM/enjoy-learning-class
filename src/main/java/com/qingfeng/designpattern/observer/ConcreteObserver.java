package com.qingfeng.designpattern.observer;

public class ConcreteObserver implements Observer {

    private String observerState;

    /**
     * 更新观测者的状态
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        this.observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
