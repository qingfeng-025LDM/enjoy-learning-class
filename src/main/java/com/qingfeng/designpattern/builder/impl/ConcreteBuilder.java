package com.qingfeng.designpattern.builder.impl;

import com.qingfeng.designpattern.builder.Builder;
import com.qingfeng.designpattern.builder.Product;

public class ConcreteBuilder implements Builder {

    private Product resultProduct;

    public void buildPart() {


    }

    public Product getResultProduct() {
        return resultProduct;
    }
}
