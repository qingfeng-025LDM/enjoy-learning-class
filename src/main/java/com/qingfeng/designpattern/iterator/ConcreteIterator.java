package com.qingfeng.designpattern.iterator;

public class ConcreteIterator implements Iterator {
    /**
     * 持有被迭代的具体的聚合对象
     */
    private ConcreteAggregate aggregate;

    private int index = -1;

    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()){
            index = index + 1;
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
