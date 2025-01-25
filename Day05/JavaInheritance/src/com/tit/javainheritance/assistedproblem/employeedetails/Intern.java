package com.tit.javainheritance.assistedproblem.employeedetails;

public class Intern extends Employee {
    private static String role = "Intern";
    protected String courseAssigned;

    // Constructor to initialize Intern details
    public Intern(String name, String id, int salary, String courseAssigned) {
        super(name, id, salary);
        this.courseAssigned = courseAssigned;
    }



    // Overriding the display method for Intern
    @Override
    public void display() {
        super.display();
        System.out.println("Role of the Employee: " + role);
        System.out.println("Course Assigned to Intern: " + courseAssigned);
    }
}
