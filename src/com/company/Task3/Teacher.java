package com.company.Task3;

import java.util.Date;

public class Teacher extends People {
    public Teacher(String surName, String name, int age) {
        super(surName, name, age);
    }

    @Override
    public void work() {
        System.out.println("teacher are working");
    }

    /*
     *@Deprecated replaced by {@link # teachNewGroup(String groupName)}
     */
    @Deprecated
    public void teachNewStudent() {
        System.out.println("teacher teaches new student");
    }

    public void teachNewGroup(String studentName) {
        System.out.println("teacher teaches new student - " + studentName);
    }

    /*
    *You are using an outdated constructor
    *And the 'date' variable is created, but not used.
     */
    @SuppressWarnings({ "deprecation", "unused", "unchecked" })
    public void getTask(){
        Date date = new Date(2014, 9, 25);
    }

}
