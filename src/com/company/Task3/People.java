package com.company.Task3;

import java.util.Date;

public class People {
    private String surName;
    private String name;
    private int age;

public People(){

}
    public People(String surName, String name, int age) {
        this.surName = surName;
        this.name = name;
        this.age = age;

    }

    public void work() {
        System.out.println("are working");
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
