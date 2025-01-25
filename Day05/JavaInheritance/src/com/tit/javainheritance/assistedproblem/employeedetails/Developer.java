package com.tit.javainheritance.assistedproblem.employeedetails;

public class Developer extends Employee{
    private static String role = "Developer";
    protected String programmingLanguage;

    // Constructor to initialize Developer details
    public Developer(String name, String id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }



    // Overriding the display method for Developer
    @Override
    public void display() {
        super.display();
        System.out.println("Role of the Employee: " + role);
        System.out.println("Programming Language of Developer: " + programmingLanguage);
    }
}
