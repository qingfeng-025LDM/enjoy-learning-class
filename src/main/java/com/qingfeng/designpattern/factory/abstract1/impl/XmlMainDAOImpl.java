package com.qingfeng.designpattern.factory.abstract1.impl;

import com.qingfeng.designpattern.factory.abstract1.OrderMainDAO;

public class XmlMainDAOImpl implements OrderMainDAO {
    public void saveOrderMain() {
        System.out.println("now in XmlMainDAOImpl saveOrderMain");
    }
}
