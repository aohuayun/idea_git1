package com.imti.pojo;

/**
 * @Author: ahy
 * @Date:2020/4/16
 * @Description:com.imti.pojo
 * @Version:1.0
 */
public class User {
    private String name;
    private Integer password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}
