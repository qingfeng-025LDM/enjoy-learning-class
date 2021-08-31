package com.qingfeng.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qingfeng.test.entity.Order;

public class Test8 {

    public static void main(String[] args) {
        String className = "com.qingfeng.test.Test7";
        Order order = new Order();
        Object obj = new Object();
        Class<?> aClass = null;
        try {
            aClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(aClass.getClass());
        System.out.println(aClass.getName());
    }

    private void convertValue(Object object){
        ObjectMapper objectMapper = new ObjectMapper();
        Order order = objectMapper.convertValue(object, Order.class);
    }

}
