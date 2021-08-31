package com.qingfeng.designpattern.iterator.instance;

import com.qingfeng.designpattern.iterator.Iterator;

public class Client {

    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        System.out.println("集团工资列表：");
        test(payManager.createIterator());

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("新收购的公司工资列表：");
        test(salaryManager.createIterator());

    }

    public static void test(Iterator iterator){
        iterator.first();
        while (!iterator.isDone()){
            Object item = iterator.currentItem();
            System.out.println("the obj = " + item);
            iterator.next();
        }
    }

}
