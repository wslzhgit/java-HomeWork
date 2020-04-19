package com.java.exam;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * 2019/11/30   16:27
 * Author:W.铭
 */
public class ZuoYe10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("铅笔");
        list.add("本子");
        list.add("橡皮擦");
        list.add("铅笔");
        list.add("铅笔");
        list.add("本子");
        list.add("本子");
        list.add("本子");

        Map<String, Integer> hashMap = new java.util.HashMap();
        for (String g : list) {
            if (hashMap.containsKey(g)) {
                hashMap.put(g, hashMap.get(g) + 1);
                continue;
            }
            hashMap.put(g, 1);
        }

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println("商品名称\t\t数量");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "\t\t\t" + entry.getValue());
        }
    }

}
