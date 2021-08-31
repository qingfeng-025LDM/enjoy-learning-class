package com.qingfeng.designpattern.builder.impl;

import com.qingfeng.designpattern.builder.Builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart();
    }
}
