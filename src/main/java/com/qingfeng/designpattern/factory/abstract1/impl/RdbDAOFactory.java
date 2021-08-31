package com.qingfeng.designpattern.factory.abstract1.impl;

import com.qingfeng.designpattern.factory.abstract1.DAOFactory;
import com.qingfeng.designpattern.factory.abstract1.OrderDetailDAO;
import com.qingfeng.designpattern.factory.abstract1.OrderMainDAO;

public class RdbDAOFactory extends DAOFactory {
    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
