package com.qingfeng.designpattern.factory.abstract1.impl;

import com.qingfeng.designpattern.factory.abstract1.OrderDetailDAO;

public class XmlDetailDAOImpl implements OrderDetailDAO {
    public void saveOrderDetail() {
        System.out.println("now in XmlDetailDAOImpl saveOrderDetail");
    }
}
