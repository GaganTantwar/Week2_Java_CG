package com.tit.javainheritance.singleinheritance.bookdetails;

public class Book {
    protected String title;
    protected String publicationYear;

    // Constructor to initialize Book details
    public Book(String title, String publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }


    // Method to display book information
    public void displayInfo() {
        System.out.println("Title of the Book: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
