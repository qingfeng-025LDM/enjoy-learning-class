package com.qingfeng.test;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Test5 {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("aaa", "aaaa");
        map.put("bbb", "bbbb");
        map.put("ccc", "cccc");
        if (StringUtils.isNotBlank((String)map.get("aaa"))){
            map.replace("aaa", "aaaa1");
        }
        System.out.println((String)map.get("aaa"));

    }

}
