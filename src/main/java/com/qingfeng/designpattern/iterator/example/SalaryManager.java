package com.qingfeng.designpattern.iterator.example;

import com.qingfeng.designpattern.iterator.example.ArrayIteratorImpl;
import com.qingfeng.designpattern.iterator.instance.PayModel;

public class SalaryManager {

    private PayModel[] pms = null;

    public PayModel[] getPays(){
        return pms;
    }

    public void calcSalary(){
        PayModel pm1 = new PayModel("王五", 2200);
        PayModel pm2 = new PayModel("赵六", 3600);
        PayModel pm3 = new PayModel("王五二号", 2200);
        PayModel pm4 = new PayModel("赵六二号", 3600);
        PayModel pm5 = new PayModel("王五三号", 2200);
        pms = new PayModel[]{pm1, pm2, pm3, pm4, pm5};
    }

    /**
     * 获取索引所对应的元素
     * @param index
     * @return
     */
    public Object get(int index){
        Object retObj = null;
        if (index < pms.length){
            retObj = pms[index];
        }
        return retObj;
    }

    public int size(){
        return this.pms.length;
    }

    public AggregationIterator createIterator(){
        return new ArrayIteratorImpl(this);
    }

}
