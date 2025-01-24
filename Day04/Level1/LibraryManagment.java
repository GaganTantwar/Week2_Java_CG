import java.util.*; // Importing the utility package for using ArrayList

class Book {
    private String title; // Title of the book
    private String author; // Author of the book

    // Constructor to initialize the book's title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter method to get the title of the book
    public String getName() {
        return title;
    }

    // Getter method to get the author of the book
    public String getauthor() {
        return author;
    }
    public void display(){
        System.out.println("Name of the Book: \""+title+"\""+"author of the Book: \""+author+"\"");
    }
}

class Library {
    private static String libraryName = "Central Library"; // Name of the library
    public ArrayList<Book> libraryBook; // List to store books in the library

    // Constructor to initialize the libraryBook list
    public Library() {
        this.libraryBook = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        libraryBook.add(book);
       
    }

    // Method to display the library details and books
    public void showLibrary() {
        System.out.println("Name of the Library is: " + libraryName);
        for (Book book : libraryBook) {
            System.out.println("Name of the Book: \"" + book.getName() + "\" Author of the Book: \"" + book.getauthor() + "\"");
        }
    }
    public void deleteLibrary(){
        libraryBook.clear();
        System.out.println("All Books in the Library is Removed");
    }
}

public class LibraryManagment {
    public static void main(String args[]) {
        // Creating book objects
        Book book1 = new Book("Harry Potter", "J.K Rowling");
        Book book2 = new Book("Fundamentals Mathematics class XII", "R.D Sharma");

        // Creating library object
        Library library = new Library();

        // Adding books to the library
        library.addBook(book1);
        System.out.print("\n");
        library.addBook(book2);
        System.out.print("\n");

        // Displaying library details and books
        library.showLibrary();
        // Deleting all books from the libarary;
        library.deleteLibrary();
        //Showing book details after deleting them from library
        book1.display();
    }
}
