package com.qingfeng.designpattern.iterator.example;

import java.util.Collection;

public interface AggregationIterator {

    /**
     * 判断是否还有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 取出下面几个元素
     * @param num
     * @return
     */
    Collection next(int num);

    /**
     * 判断是否还有上一个元素
     * @return
     */
    boolean hasPrevious();

    /**
     * 取出上面几个元素
     * @param num
     * @return
     */
    Collection previous(int num);

}
