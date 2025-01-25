package com.tit.javainheritance.assistedproblem.employeedetails;

public class EmployeeDetails {
    public static void main(String args[]) {
        // Creating an instance of Manager
        Employee jane = new Manager("Jane Smith", "EMPID821", 100000, 10);
        jane.display();
        System.out.println(" ");

        // Creating an instance of Developer
        Employee kane = new Developer("Kane Williams", "EMPID632", 45000, "Java");
        kane.display();
        System.out.println(" ");

        // Creating an instance of Intern
        Employee david = new Intern("David Marsh", "EMPID645", 20000, "Java FullStack");
        david.display();
    }
}
