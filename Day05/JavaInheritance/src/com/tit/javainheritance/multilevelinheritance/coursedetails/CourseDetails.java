package com.tit.javainheritance.multilevelinheritance.coursedetails;

public class CourseDetails {
    public static void main(String args[]) {
        // Creating an instance of Course
        Course java1 = new Course("Java Fundamentals", "3 Months");
        java1.display();
        System.out.println(" ");

        // Creating an instance of OnlineCourse
        OnlineCourse java2 = new OnlineCourse("Java Fundamentals", "3 Months", "Durga Technologies", true);
        java2.display();
        System.out.println(" ");

        // Creating an instance of PaidCourse
        PaidCourse java = new PaidCourse("Java Fundamentals", "3 Months", "Durga Technologies", true, 5000, 10);
        java.display();
    }
}
