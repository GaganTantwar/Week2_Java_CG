class Book {
    // Static variable to store the name of the library (shared among all instances)
    public static String libraryName = "Central Library Bhopal";
    // Private instance variables to store the title and author of the book
    private String title;
    private String author;
    // Final instance variable to store the ISBN of the book (cannot be changed once assigned)
    private final int isbn;

    // Constructor to initialize the title, author, and ISBN of the book
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to print the name of the library
    public static void displayLibraryName() {
        System.out.println("Name of the Library: " + libraryName);
    }

    // Method to display the book details
    public void display() {
        System.out.println("Name of the Book: " + title);
        System.out.println("Name of the Author: " + author);
        System.out.println("ISBN of the Book: " + isbn);
    }
}

public class LibraryManagement {
    public static void main(String args[]) {
        // Creating two instances of Book with different titles, authors, and ISBNs
        Book book1 = new Book("How to Win Friends and Influence People", "Dale Carnegie", 567979);
        Book book2 = new Book("Harry Potter", "J.K. Rowling", 584464);

        // Checking if book1 is an instance of Book and displaying its details
        if (book1 instanceof Book) {
            System.out.println("book1 is an instance of Book");
            book1.display();
        }
        System.out.print("\n");

        // Checking if book2 is an instance of Book and displaying its details
        if (book2 instanceof Book) {
            System.out.println("book2 is an instance of Book");
            book2.display();
        }
        System.out.print("\n");

        // Calling the static method to print the name of the library
        Book.displayLibraryName();
    }
}
