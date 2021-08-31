package com.qingfeng.designpattern.command.impl;

import com.qingfeng.designpattern.command.CommandApi;
import com.qingfeng.designpattern.command.OperationApi;

public class SubstractCommand implements CommandApi {

    private OperationApi operationApi = null;

    private int opeNum;

    public SubstractCommand(OperationApi operationApi, int opeNum){
        this.operationApi = operationApi;
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        this.operationApi.substract(opeNum);
    }

    @Override
    public void undo() {
        this.operationApi.add(opeNum);
    }

    @Override
    public void redo() {
        this.execute();
    }
}
