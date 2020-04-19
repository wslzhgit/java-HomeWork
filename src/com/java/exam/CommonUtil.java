package com.java.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2019/11/30   15:41
 * Author:W.铭
 */
public class CommonUtil {
    //实现日期格式的字符串转换为java.util.Date类型
    public void date(String str){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        System.out.println( sdf.format(d));
    }
    //实现java.util.Date类型的值转换为字符串格式
    public String str(Date date){
        return date.toString();
    }

    public static void main(String[] args) {
        CommonUtil c1 = new CommonUtil();
        String str ="YYYY-MM-dd";
        c1.date(str);

        Date d = new Date();
        String str1 = c1.str(d);
        System.out.println(str1);
    }
}
