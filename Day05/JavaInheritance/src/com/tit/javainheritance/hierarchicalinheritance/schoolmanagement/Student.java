package com.tit.javainheritance.hierarchicalinheritance.schoolmanagement;

public class Student extends Person{
    protected String rollNumber;

    // Constructor to initialize Student details
    public Student(String name, int age, String rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    // Overriding the displayRole method for Student
    @Override
    public void displayRole() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Age of the Student: " + age);
        System.out.println("Roll Number of the Student: " + rollNumber);
    }
}
