package com.qingfeng.designpattern.iterator.instance;

import com.qingfeng.designpattern.iterator.Iterator;

public class CollectionIteratorImpl implements Iterator {

    private PayManager aggregate = null;

    private int index = -1;

    public CollectionIteratorImpl(PayManager aggregate){
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
