package com.tit.javainheritance.hierarchicalinheritance.schoolmanagement;

public class Staff extends Person{
    protected String job;

    // Constructor to initialize Staff details
    public Staff(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    // Overriding the displayRole method for Staff
    @Override
    public void displayRole() {
        System.out.println("Name of the Staff Member: " + name);
        System.out.println("Age of the Staff Member: " + age);
        System.out.println("Job Role of the Staff: " + job);
    }
}
