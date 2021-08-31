package com.qingfeng.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test2 {

    public static void main(String[] args) {
        String data = "{\"ResourceInfos\":[{\"DataItems\":[],\"ResourceName\":\"\",\"ReturnInfos\":[{\"DataInfo\":[],\"CheckSourceInfos\":{\"xm\":\"王银剑\"},\"CheckCode\":\"001\",\"CheckCodeDesc\":\"姓名不一致\"}]}]}";
        JSONObject dataJson = JSONObject.parseObject(data);
        JSONArray resourceInfos = dataJson.getJSONArray("ResourceInfos");
        System.out.println(resourceInfos);
        JSONObject jsonObject = resourceInfos.getJSONObject(0);
//        .getJSONObject("ReturnInfos")
        System.out.println(jsonObject);
        JSONArray returnInfos = jsonObject.getJSONArray("ReturnInfos");
        System.out.println(returnInfos);
        JSONObject jsonObject1 = returnInfos.getJSONObject(0);
        System.out.println(jsonObject1);
        System.out.println(jsonObject1.getString("CheckCodeDesc"));
//        System.out.println(checkCodeDesc);

    }

}
