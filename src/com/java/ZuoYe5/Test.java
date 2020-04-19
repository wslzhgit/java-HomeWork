package com.java.ZuoYe5;

/**
 * 2019/11/30   12:27
 * Author:W.铭
 */
public class Test {
    private String name;
    private String gender;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) throws Exception {
        if ("男".equals(gender) || "女".equals(gender)) {
            this.gender = gender;
        } else {
            throw new GenderException("性别必须为男或者女！");
        }
    }

    public static void main(String[] args) throws Exception {
        Test t1 = new Test();
        t1.setGender("老人");
    }
}
