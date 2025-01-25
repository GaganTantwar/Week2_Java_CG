package com.tit.javainheritance.hierarchicalinheritance.schoolmanagement;

public class SchoolManagement {
    public static void main(String args[]) {
        // Creating an instance of Student
        Person ram = new Student("Ram Sharma", 18, "0111al211018");
        ram.displayRole();
        System.out.println(" ");

        // Creating an instance of Teacher
        Person riya = new Teacher("Riya Roy", 25, "Data Structures");
        riya.displayRole();
        System.out.println(" ");

        // Creating an instance of Staff
        Person zoya = new Staff("Zoya Perveen", 26, "Calling");
        zoya.displayRole();
    }
}
