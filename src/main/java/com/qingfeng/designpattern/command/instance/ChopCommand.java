package com.qingfeng.designpattern.command.instance;

import com.qingfeng.designpattern.command.CommandApi;

public class ChopCommand implements CommandApi {

    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi){
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        this.cookApi.cook("绿豆排骨煲");
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
