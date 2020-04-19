package com.java.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2019/11/29   19:22
 * Author:W.铭
 */
public class ZuoYe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Float> bList = new ArrayList<>();


        for (int j=1;j<=3;j++) {
            float sum=0;
            int i=1;
            for (;i<=5;i++) {
                    System.out.print("\n请入输第"+i+"名学生成绩：");
                    float score = input.nextFloat();
                    sum = score+sum;
                }
            if (i == 5) {
                sum=0;
            }
            bList.add(sum);
            System.out.println("第"+j+"个班的总分"+sum+"平均分："+(sum/5));
        }

    }
}
