package com.qingfeng.designpattern.command;

/**
 * 命令接口
 */
public interface CommandApi {

    /**
     * 执行命令对应的操作
     */
    void execute();

    /**
     * 撤销操作
     */
    void undo();

    /**
     *
     */
    void redo();

}
