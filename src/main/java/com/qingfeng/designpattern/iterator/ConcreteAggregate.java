package com.qingfeng.designpattern.iterator;

public class ConcreteAggregate extends Aggregate {
    /**
     * 表示聚合对象具体的内容
     */
    private String[] ss = null;

    public ConcreteAggregate(String[] ss){
        this.ss = ss;
    }


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 获取索引所对应的元素
     * @param index
     * @return
     */
    public Object get(int index){
        Object retObj = null;
        if (index < ss.length){
            retObj = ss[index];
        }
        return retObj;
    }

    public int size(){
        return this.ss.length;
    }
}
