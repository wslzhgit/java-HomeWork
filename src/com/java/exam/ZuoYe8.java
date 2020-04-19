package com.java.exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 2019/11/30   16:05
 * Author:W.铭
 */
public class ZuoYe8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = input.next();
        char[] cha = str.toCharArray();
        Set<Object> chaSet = new HashSet<>();
        for (int i=0;i<cha.length;i++) {
            chaSet.add(cha[i]);
        }
        System.out.print("过滤后的字符串是：");
        chaSet.forEach(temp->
                System.out.print(temp));
    }
}
