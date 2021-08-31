package com.qingfeng.designpattern.factory.abstract1.impl;

import com.qingfeng.designpattern.factory.abstract1.OrderMainDAO;

public class RdbMainDAOImpl implements OrderMainDAO {
    public void saveOrderMain() {
        System.out.println("now in RdbMainDAOImpl saveOrderMain");
    }
}
