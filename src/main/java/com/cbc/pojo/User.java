package com.cbc.pojo;

/**
 * @program: springbootdemo
 * @Date: 2019/9/27 15:04
 * @Author: Mr.Deng
 * @Description:
 */
public class User {
    private String name;
    private String password;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
