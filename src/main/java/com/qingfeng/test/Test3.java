package com.qingfeng.test;

import com.alibaba.fastjson.JSONObject;

public class Test3 {

    public static void main(String[] args) {
        String data = "{\"count\":1,\"rows\":[{\"dept_code\":\"36010401\",\"name_woman\":\"王莹\",\"cert_no\":\"J360104-2015-000535\",\"cert_num_woman\":\"420922198807251022\",\"nation_woman\":\"156\",\"dept_name\":\"青云谱区民政局婚姻登记处\",\"op_date\":\"2015-03-18 00:00:00\",\"birth_woman\":\"1988-07-25 00:00:00\",\"cert_num_man\":\"360481198902210014\",\"birth_man\":\"1989-02-21 00:00:00\",\"nation_man\":\"156\",\"op_type\":\"IA\",\"name_man\":\"周俊\"}]}";

        JSONObject dataJson = JSONObject.parseObject(data);
        JSONObject rows = dataJson.getJSONArray("rows").getJSONObject(0);
        System.out.println(rows);
    }

}
