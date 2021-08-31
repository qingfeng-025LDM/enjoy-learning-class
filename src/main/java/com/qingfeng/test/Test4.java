package com.qingfeng.test;

import com.qingfeng.test.entity.Order;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test4 {

    public static void main(String[] args) {
//        Double ysje = null;
//        BigDecimal d =  new BigDecimal(0);
//        Double zdshSfje = d.doubleValue();
//        System.out.println(d.doubleValue());
//        if( ( (ysje != null && ysje.doubleValue() != 0 && (zdshSfje == null || zdshSfje.doubleValue() == 0))
//                || ((ysje == null || ysje.doubleValue() == 0) && zdshSfje != null && zdshSfje.doubleValue() != 0 )
//                || (ysje!=null && zdshSfje != null && ysje.doubleValue() != zdshSfje.doubleValue()) )){
//            System.out.println("dddd");
//        }


//        List<Order>list = new ArrayList<>();
//        Order order = new Order();
//        order.setYsje(new BigDecimal(1));
//        list.add(order);
//        Order order1 = new Order();
//        order1.setYsje(new BigDecimal(0));
//        list.add(order1);
////        double sum = list.stream().filter(a -> a.getYsje().doubleValue() > 0).mapToDouble(a -> a.getYsje().doubleValue()).sum();
////        System.out.println(sum);
//        BigDecimal reduce = list.stream().map(Order::getYsje).reduce(BigDecimal.ZERO, BigDecimal::add);
//        System.out.println(reduce);

        test1();

    }

    public static void test1(){
        String strs = "111\r222\r333\r444";
        String[] strArr = strs.split("\r");
        printArr(strArr);
        List<String> strList = Arrays.asList(strArr);
        printList(strList);
        for (String str : strList) {
            strList.indexOf(str);
            if ("111".equals(str)){
                strList.set(strList.indexOf(str), str + "-1");
                continue;
            }
            if ("222".equals(str)){
                strList.set(strList.indexOf(str), str + "-1");
                continue;
            }
            if ("333".equals(str)){
                strList.set(strList.indexOf(str), str + "-1");
                continue;
            }
            if ("444".equals(str)){
                strList.set(strList.indexOf(str), str + "-1");
                continue;
            }
        }
        printArr(strArr);
        printList(strList);
        for (String str : strArr) {
            if (!str.endsWith("-1")){
                System.out.println("退出！");
                return;
            }
        }
        System.out.println(strList.indexOf("555"));
    }

    public static void printArr(String[] strArr){
        for (String str : strArr) {
            System.out.println("Array------------->" + str);
        }
    }

    public static void printList(List<String> list){
        for (String str : list) {
            System.out.println("list------------->" + str);
        }
    }

}
