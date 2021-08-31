package com.qingfeng.designpattern.factory.abstract1;


public abstract class DAOFactory {

    public abstract OrderMainDAO createOrderMainDAO();


    public abstract OrderDetailDAO createOrderDetailDAO();

}
