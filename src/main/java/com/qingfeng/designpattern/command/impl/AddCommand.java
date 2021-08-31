package com.qingfeng.designpattern.command.impl;

import com.qingfeng.designpattern.command.CommandApi;
import com.qingfeng.designpattern.command.OperationApi;

/**
 * 加法命令实现对象
 */
public class AddCommand implements CommandApi {

    private OperationApi operationApi = null;

    private int opeNum;

    @Override
    public void execute() {
        this.operationApi.add(opeNum);
    }

    @Override
    public void undo() {
        //撤销操作就是做减法
        this.operationApi.substract(opeNum);
    }

    @Override
    public void redo() {
        this.execute();
    }

    public AddCommand(OperationApi operationApi, int opeNum){
        this.operationApi = operationApi;
        this.opeNum = opeNum;
    }
}
