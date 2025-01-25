package com.tit.javainheritance.multilevelinheritance.coursedetails;

public class PaidCourse extends OnlineCourse {
    protected int fees;
    protected int discount;

    // Constructor to initialize PaidCourse details
    public PaidCourse(String courseName, String duration, String platform, boolean isRecorded, int fees, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fees = fees;
        this.discount = discount;
    }

    // Overriding the display method for PaidCourse
    @Override
    public void display() {
        super.display();
        System.out.println("Fees of the Course: " + fees);
        System.out.println("Discount of the Course: " + discount);
    }
}
