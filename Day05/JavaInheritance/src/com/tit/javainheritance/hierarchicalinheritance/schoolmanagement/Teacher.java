package com.tit.javainheritance.hierarchicalinheritance.schoolmanagement;

public class Teacher extends Person {
    protected String subject;

    // Constructor to initialize Teacher details
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding the displayRole method for Teacher
    @Override
    public void displayRole() {
        System.out.println("Name of the Teacher: " + name);
        System.out.println("Age of the Teacher: " + age);
        System.out.println("Subject Assigned to Teacher: " + subject);
    }
}
