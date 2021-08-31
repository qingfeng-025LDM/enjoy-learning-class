package com.qingfeng.designpattern.iterator.example;

import com.qingfeng.designpattern.iterator.instance.PayModel;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayIteratorImpl implements  AggregationIterator{

    private PayModel[] pms = null;

    /**
     * 用来记录当前迭代到的位置索引
     */
    private int index = 0;

    public ArrayIteratorImpl(SalaryManager aggregate){
        this.pms = aggregate.getPays();
    }

    @Override
    public boolean hasNext() {
        if (pms != null && index <= (pms.length - 1)){
            return true;
        }
        return false;
    }

    @Override
    public Collection next(int num) {
        Collection col = new ArrayList();
        int count = 0;
        while (hasNext() && count < num){
            col.add(pms[index]);
            //每取走一个值，就把已访问索引加1
            index++;
            count++;
        }
        System.out.println(index);
        return col;
    }

    @Override
    public boolean hasPrevious() {
        if (pms != null && index != 0){
            return true;
        }
        return false;
    }

    @Override
    public Collection previous(int num) {
        Collection col = new ArrayList();
        int count = 0;
        index = index - num;
        while (hasPrevious() && count < num){
            col.add(pms[index]);
            index++;
            count++;
        }
        System.out.println(index);
        return col;
    }
}
