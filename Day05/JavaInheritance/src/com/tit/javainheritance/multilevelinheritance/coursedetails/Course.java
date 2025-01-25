package com.tit.javainheritance.multilevelinheritance.coursedetails;

public class Course {
    protected String courseName;
    protected String duration;

    // Constructor to initialize Course details
    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display Course details
    public void display() {
        System.out.println("Name of the Course: " + courseName);
        System.out.println("Duration of the Course: " + duration);
    }
}
