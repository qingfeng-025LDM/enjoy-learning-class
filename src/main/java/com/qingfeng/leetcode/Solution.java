package com.qingfeng.leetcode;

import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static boolean isAlienSorted(String[] words, String order){
        for (int i = 0; i < words.length-1; i++){
            if (words[i] == words[i+1]){
                continue;
            }
            if (words[i].startsWith(words[i+1])){
                return false;
            }
            char[] chars1 = words[i].toCharArray();
            char[] chars2 = words[i+1].toCharArray();
            int length = 0;
            if (words[i].length() > words[i+1].length()){
                length = words[i+1].length();
            }else {
                length = words[i].length();
            }
            for (int k = 0; k < length; k++){
                if (order.indexOf(chars1[k]) < order.indexOf(chars2[k])){
                    break;
                }else if (order.indexOf(chars1[k]) > order.indexOf(chars2[k])){
                    return false;
                }else {
                    continue;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String[] words = {"word","world","row"};
//        System.out.println(isAlienSorted(words, "worldabcefghijkmnpqstuvxyz"));
//        System.out.println("==========" + ('u'-'a'));

        int[] A = {9,9,9,9,9,9,9,9,9,9};
        int K = 1;
        addToArrayForm(A, K);
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<Integer>();

        return list;
    }

}
