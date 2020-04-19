package com.java.exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2019/11/30   11:49
 * Author:W.铭
 */
public class ZuoYe6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] attr = new int[5];

        System.out.println("请输入5名学员的成绩：");
        for (int i=0;i<5;i++ ) {
            int score = input.nextInt();
            attr[i] = score;
        }
        Arrays.sort(attr);
        System.out.println("学员成绩按升序排序：");
        for (int att : attr) {
            System.out.print(att+"\t");
        }

        System.out.println("\n学员成绩按降序排序：");
        for(int i=attr.length-1;i>=0;i--){
            System.out.print(attr[i]+"\t");
        }
    }
}
