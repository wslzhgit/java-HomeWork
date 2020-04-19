package com.java.ZuoYe4;

/**
 * 2019/11/30   10:51
 * Author:W.铭
 */
public class Student {
     String name;
     float score;

    public Student() {
    }

    public Student(String name, float score) {
        this.name = name;
        this.score = score;
    }

    public void show() {
        System.out.println(name+"的成绩是："+score);
    }
}
