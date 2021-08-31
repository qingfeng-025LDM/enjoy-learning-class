package com.qingfeng.designpattern.iterator;

public class Client {

    public void someOperation(){
        String[] names = {"张三", "李四", "王五"};

        Aggregate aggregate = new ConcreteAggregate(names);

        Iterator iterator = aggregate.createIterator();
        iterator.first();
        while (!iterator.isDone()){
            //取出当前元素
            Object obj = iterator.currentItem();
            System.out.println("this obj == " + obj);
            iterator.next();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.someOperation();
    }

}
