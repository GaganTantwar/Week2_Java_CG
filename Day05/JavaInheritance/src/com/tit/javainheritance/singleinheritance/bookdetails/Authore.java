package com.tit.javainheritance.singleinheritance.bookdetails;

public class Authore extends Book{
    protected String name;
    protected String bio;

    // Constructor to initialize Authore details
    public Authore(String title, String publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding the displayInfo method for Authore
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name of Authore: " + name);
        System.out.println("Bio of Authore: " + bio);
    }
}
