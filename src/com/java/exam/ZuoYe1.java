package com.java.exam;

import java.util.Scanner;

/**
 * 2019/11/29   18:42
 * Author:W.铭
 */
public class ZuoYe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入单价(￥):");
        float price = input.nextFloat();
        System.out.print("请输入数量:");
        int num = input.nextInt();
        System.out.print("请输入金额(￥):");
        float money1 = input.nextFloat();
        //应收金额

        //找零
        float money3;
        if (price*num>=500){
            money3 = money1-price*num*0.8f;
            System.out.println("应收金额为：￥"+(price*num*0.8f)+",找零为：￥"+money3);

        }else {
            money3 = money1 - price*num;;
            System.out.println("应收金额为：￥"+(price*num)+",找零为：￥"+money3);
        }
    }

}
