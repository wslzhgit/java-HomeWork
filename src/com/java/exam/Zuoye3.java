package com.java.exam;

import java.util.Scanner;

/**
 * 2019/11/30   10:34
 * Author:W.铭
 */
public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=1;i<=3;i++) {
            System.out.print("请输入用户名：");
            String name = input.next();
            System.out.print("请输入密码：");
            String pwd = input.next();
            if (name.equals("admin") && pwd.equals("admin")) {
                System.out.println("欢迎" + name + "登录！");
                break;
            } else {
                System.out.println("录入错误，您还有"+(3-i)+"次机会！");
            }
        }
    }
}
