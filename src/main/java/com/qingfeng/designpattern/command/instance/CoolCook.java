package com.qingfeng.designpattern.command.instance;

public class CoolCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("凉菜" + name + "已经做好，本厨师正在装盘。");
    }
}
