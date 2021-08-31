package com.qingfeng.designpattern.factory.abstract1.impl;

import com.qingfeng.designpattern.factory.abstract1.OrderDetailDAO;

public class RdbDetailDAOImpl implements OrderDetailDAO {
    public void saveOrderDetail() {
        System.out.println("now in RdbDetailDAOImpl saveOrderDetail");
    }
}
