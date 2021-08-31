package com.qingfeng.designpattern.factory.abstract1;

import com.qingfeng.designpattern.factory.abstract1.impl.RdbDAOFactory;

public class BusinessObject {

    public static void main(String[] args) {
        DAOFactory daoFactory = new RdbDAOFactory();
        OrderMainDAO orderMainDAO = daoFactory.createOrderMainDAO();
        OrderDetailDAO orderDetailDAO = daoFactory.createOrderDetailDAO();

        orderMainDAO.saveOrderMain();
        orderDetailDAO.saveOrderDetail();
    }

}
