package com.company.Task3;

import java.lang.annotation.Annotation;
import java.util.Date;

public class Student extends People {
    public Student() {

    }

    public Student(String surName, String name, int age) {
        super(surName, name, age);
    }

    @Override
    public void work() {
        System.out.println("Student are learning");
    }

    public void createClassInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> newClass= Class.forName(className);
        if (newClass.isAnnotationPresent((Class<? extends Annotation>) Student.class)){
            Object object= newClass.newInstance();
        }

    }

}
