package com.tit.javainheritance.hierarchicalinheritance.schoolmanagement;

public class Person {
    protected String name;
    protected int age;

    // Constructor to initialize Person details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the role of the person
    public void displayRole() {
        System.out.println("Name of the Person: " + name);
        System.out.println("Age of the Person: " + age);
    }
}
