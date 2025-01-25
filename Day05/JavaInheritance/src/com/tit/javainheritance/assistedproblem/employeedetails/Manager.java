package com.tit.javainheritance.assistedproblem.employeedetails;

public class Manager extends Employee{
    private static String role = "Manager";
    protected int teamSize;

    // Constructor to initialize Manager details
    public Manager(String name, String id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }



    // Overriding the display method for Manager
    @Override
    public void display() {
        super.display();
        System.out.println("Role of the Employee: " + role);
        System.out.println("Team Size of the Manager: " + teamSize);
    }
}
