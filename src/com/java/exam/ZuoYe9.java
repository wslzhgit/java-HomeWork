package com.java.exam;

import java.util.Scanner;

/**
 * 2019/11/30   16:05
 * Author:W.铭
 */
public class ZuoYe9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String strIn = input.next();
        boolean isDui=true;
        for(int i=0;i<=strIn.length()/2;i++){
        if(strIn.charAt(i)!=strIn.charAt(strIn.length()-i-1)){ //charAt()获得指定位置的字符
            isDui=false;
            break;
        }
        }

            if(isDui){
            System.out.println(strIn+"是对称字符串");

            }else{
                System.out.println(strIn+"不是对称字符串");
            }
    }
}
