package com.qingfeng.designpattern.iterator.example;

import java.util.Collection;
import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        AggregationIterator iterator = salaryManager.createIterator();
        //获取第一页，每页显示2条
        Collection col1 = iterator.next(2);
        System.out.println("第一页数据：");
        print(col1);
        //获取第二页，每页显示2条
        Collection col2 = iterator.next(2);
        System.out.println("第二页数据：");
        print(col2);

        System.out.println("此时索引指向第三页");
        //获取前一页的数据
        Collection previous = iterator.previous(2);
        System.out.println("再次获取第二页数据：");
        print(previous);
    }

    private static void print(Collection col){
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

}
