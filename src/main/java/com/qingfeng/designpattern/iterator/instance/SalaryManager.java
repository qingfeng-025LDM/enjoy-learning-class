package com.qingfeng.designpattern.iterator.instance;

import com.qingfeng.designpattern.iterator.Aggregate;
import com.qingfeng.designpattern.iterator.Iterator;

public class SalaryManager extends Aggregate {

    private PayModel[] pms = new PayModel[2];

    public PayModel[] getPays(){
        return pms;
    }

    public void calcSalary(){
        PayModel pm1 = new PayModel();
        pm1.setPay(2200);
        pm1.setUserName("王五");
        PayModel pm2 = new PayModel();
        pm2.setPay(3300);
        pm2.setUserName("赵六");
        pms[0] = pm1;
        pms[1] = pm2;
    }



    @Override
    public Iterator createIterator() {
        return new ArrayIteratorImpl(this);
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
}
