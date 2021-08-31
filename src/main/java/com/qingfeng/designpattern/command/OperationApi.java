package com.qingfeng.designpattern.command;

/**
 * 操作接口
 */
public interface OperationApi {

    /**
     * 获取计算结果
     * @return
     */
    int getResult();

    /**
     * 设置计算开始的初始值
     * @param result
     */
    void setResult(int result);

    /**
     * 执行加法
     * @param num
     */
    void add(int num);

    /**
     * 执行减法
     * @param num
     */
    void substract(int num);
}
