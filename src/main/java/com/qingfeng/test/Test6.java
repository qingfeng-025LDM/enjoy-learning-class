package com.qingfeng.test;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class Test6 {

    public static void main(String[] args) {
        String configs = "{\"HJSB\":{\"zdsb\":false,\"sfsb\":false,\"sbjdId\":\"1\",\"sbjd\":\"登簿\"},\"ZDSP\":{\"核定\":{\"spjd\":\"核定\",\"spdm\":\"DYAQDJ-FWDYDJ-001\",\"sfqd\":true,\"SPGZ\":[\"ryxx.drl\",\"fwdydj.drl\",\"sfhd.drl\"]}}}";

        JSONObject configsJson = JSONObject.parseObject(configs);
        JSONObject zdspJson = configsJson.getJSONObject("ZDSP");     //自动审批配置信息
        for (Map.Entry<String, Object> entry : zdspJson.entrySet()){
            JSONObject jsonObject = zdspJson.getJSONObject(entry.getKey());
            if ((Boolean)jsonObject.get("sfqd")){
                System.out.println(111);
            }
        }

    }

}
