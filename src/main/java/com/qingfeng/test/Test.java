package com.qingfeng.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {

    Test(){
        System.out.println("11111");
    }


    public static void main(String[] args) {
        String targets = "{\"target\":[{\"node\":[],\"users\":[\"wanlijuan\",\"zhanglvjun\"],\"roles\":[]}]}";
        JSONObject jsonObject = JSONObject.parseObject(targets);
        System.out.println(jsonObject);

        JSONArray target = jsonObject.getJSONArray("target");
        System.out.println("target=====" + target);

        String s = target.getJSONObject(0).toString();

        Map map = JSONObject.parseObject(s, Map.class);
        map.put("node", "核定");
        List<Map> list = new ArrayList<Map>();
        list.add(map);
        jsonObject.put("target", list);
        System.out.println("targets=======" + targets);
        System.out.println("jsonObject===" + jsonObject.toString());

    }
}
