package com.java.ZuoYe4;

/**
 * 2019/11/30   11:16
 * Author:W.铭
 */
public class Score {
    public void modifyScore(Student[] stus){
        for (int i=0;i<stus.length;i++) {
            if (stus[i].score < 60) {
                stus[i].score+=2;
            }
        }
    }
    public  void showInfo(Student[] stus) {
        for (Student stu : stus) {
            stu.show();
        }
    }

    public static void main(String[] args) {
        Score scer = new Score();
        Student[] stu =new Student[3];
        Student s1 = new Student("张三",40);
        Student s2 = new Student("李四",90);
        Student s3 = new Student("王五",43);
        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;
        scer.modifyScore(stu);
        scer.showInfo(stu);
    }
}
