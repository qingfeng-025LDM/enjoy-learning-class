package com.qingfeng.test;

public class Test9 {

    public static void main(String[] args) {
        String[] str  = new String[10];
        for (int i=0; i < str.length; i++){
            str[i] = String.valueOf(i + 1);
        }
        print(str);

    }


    private static void print(String[] str){
        for (String s : str) {

            try {
                System.out.println("start:" + System.currentTimeMillis());
                s = s + "1";
                System.out.println(s);
                Thread.sleep(10000);
                System.out.println("end:" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
