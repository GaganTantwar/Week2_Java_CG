package com.tit.javainheritance.assistedproblem.employeedetails;

public class Employee {
    protected String name;
    protected String id;
    protected int salary;

    // Constructor to initialize Employee details
    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display Employee details
    public void display() {
        System.out.println("Name of the Employee: " + name);
        System.out.println("Id of the Employee: " + id);
        System.out.println("Salary of the Employee: " + salary);
    }
}
