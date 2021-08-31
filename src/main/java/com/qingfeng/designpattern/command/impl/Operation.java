package com.qingfeng.designpattern.command.impl;

import com.qingfeng.designpattern.command.OperationApi;

public class Operation implements OperationApi {

    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int num) {
        this.result += num;
    }

    @Override
    public void substract(int num) {
        this.result -= num;
    }
}
