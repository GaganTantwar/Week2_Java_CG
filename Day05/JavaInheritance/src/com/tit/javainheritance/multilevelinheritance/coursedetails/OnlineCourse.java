package com.tit.javainheritance.multilevelinheritance.coursedetails;

public class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    // Constructor to initialize OnlineCourse details
    public OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding the display method for OnlineCourse
    @Override
    public void display() {
        super.display();
        System.out.println("Platform of the Course: " + platform);
        System.out.println("Course is Recorded: " + isRecorded);
    }
}
