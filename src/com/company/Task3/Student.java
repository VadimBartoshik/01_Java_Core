package com.company.Task3;

import java.util.Date;

public class Student extends People {


    public Student(String surName, String name, int age) {
        super(surName, name, age);
    }

    @Override
    public void work() {
        System.out.println("Student are learning");
    }


}
