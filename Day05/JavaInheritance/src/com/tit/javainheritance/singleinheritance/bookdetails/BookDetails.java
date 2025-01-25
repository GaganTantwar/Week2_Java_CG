package com.tit.javainheritance.singleinheritance.bookdetails;

public class BookDetails {
    public static void main(String args[]) {
        // Creating an instance of Authore
        Authore jk = new Authore("Harry Potter", "1999", "J.K. Rowling", "Famous For Fiction Stories");
        jk.displayInfo();
        System.out.println(" ");

        // Creating an instance of Book with Authore details
        Book javaCore = new Authore("Java Fundamentals", "2025", "Gagan Tantwar", "Famous for Programming");
        javaCore.displayInfo();
    }
}
