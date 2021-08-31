package com.qingfeng.designpattern.iterator.instance;

import com.qingfeng.designpattern.iterator.Aggregate;
import com.qingfeng.designpattern.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class PayManager extends Aggregate {

    private List list = new ArrayList();

    /**
     * 获得工资列表
     * @return
     */
    public List getPayList(){
        return list;
    }

    /**
     * 计算工资
     */
    public void calcPay(){
        PayModel payModel1 = new PayModel();
        payModel1.setPay(3000);
        payModel1.setUserName("张三");
        PayModel payModel2 = new PayModel();
        payModel2.setPay(4000);
        payModel2.setUserName("李四");
        list.add(payModel1);
        list.add(payModel2);
    }

    /**
     * 获取索引所对应的元素
     * @param index
     * @return
     */
    public Object get(int index){
        Object retObj = null;
        if (index < this.list.size()){
            retObj = this.list.get(index);
        }
        return retObj;
    }

    public int size(){
        return this.list.size();
    }

    @Override
    public Iterator createIterator() {
        return new CollectionIteratorImpl(this);
    }
}
