package com.qingfeng.test;

import com.alibaba.fastjson.JSONObject;
import com.qingfeng.designpattern.model.Person;

import java.util.Iterator;
import java.util.Map;

public class Test1 {


    public static void main(String[] args) {
        String fj = "抵押凭证：洪房权证东湖区字第1000653421号" +
                "\n该不动产的建设用地使用权性质为划拨，依法拍卖或通过其他方式依法实现抵押权时，应先行补缴土地出让金后，抵押权人方可优先受偿。";
        System.out.println(fj);
        String s = fj.replaceAll("\n", ";");
        System.out.println(s);

        String configs1 = "{\"HJSB\":{\"zdsb\":false,\"sfsb\":false,\"sbjdId\":\"1\",\"sbjd\":\"登簿\"}}";
        String configs = "{\"HJSB\":{\"zdsb\":false,\"sfsb\":false,\"sbjdId\":\"1\",\"sbjd\":\"登簿\"},\"ZDSP\":{\"核定\":{\"spjd\":\"核定\",\"spdm\":\"DYAQDJ-FWDYDJ-001\",\"sfqd\":true,\"SPGZ\":[\"fwdydj.drl\",\"sfhd.drl\",\"ryxx.drl\"]}}}";
        JSONObject jsonObject = JSONObject.parseObject(configs);
        if (jsonObject.containsKey("ZDSP")){
            JSONObject zdsp = jsonObject.getJSONObject("ZDSP");
            Iterator<Map.Entry<String, Object>> iterator = zdsp.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String, Object> next = iterator.next();
                String sfqd = JSONObject.parseObject(next.getValue().toString()).getString("sfqd");
                System.out.println(sfqd);
            }
        }


        String str = "1231313";
        String aa = str.replaceAll("\\*", "").replaceAll("\\$", "");
        System.out.println(aa);
    }

}
