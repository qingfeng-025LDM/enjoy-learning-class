package com.qingfeng.test;

import com.qingfeng.DateUtil;

import java.util.Date;

public class Test10 {

    public static void main(String[] args) {
        Date date = new Date();
        date = DateUtil.setMinutes(date, 0);
        date = DateUtil.setSeconds(date, 0);
        String s = DateUtil.dateToFormatString(date, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);
    }

}
