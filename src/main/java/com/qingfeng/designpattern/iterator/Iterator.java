package com.qingfeng.designpattern.iterator;

/**
 * 迭代器模式
 */
public interface Iterator {

    /**
     * 移动到聚合对象的第一个位置
     */
    void first();

    /**
     * 移动到聚合对象的下一个位置
     */
    void next();

    /**
     * 判断是否已经移动到聚合对象的最后一个位置
     */
    boolean isDone();

    /**
     * 获取迭代的当前元素
     */
    Object currentItem();

}
