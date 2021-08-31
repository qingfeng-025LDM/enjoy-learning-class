package com.qingfeng.designpattern.command.instance;

public class HotCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("本厨师正在做：" + name);
    }
}
