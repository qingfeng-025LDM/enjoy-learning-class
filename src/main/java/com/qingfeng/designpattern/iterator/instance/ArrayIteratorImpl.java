package com.qingfeng.designpattern.iterator.instance;

import com.qingfeng.designpattern.iterator.Iterator;

public class ArrayIteratorImpl implements Iterator {

    /**
     * 用来存放被迭代的聚合对象
     */
    private SalaryManager aggregate = null;

    /**
     * 用来记录当前迭代到的位置索引
     */
    private int index = -1;

    public ArrayIteratorImpl(SalaryManager aggregate){
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()){
            index += 1;
        }
    }

    @Override
    public boolean isDone() {
        if (index == this.aggregate.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
