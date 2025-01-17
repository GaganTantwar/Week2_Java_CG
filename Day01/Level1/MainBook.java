import java.util.*; 

// Class representing a book
class Book {
    private String title; // Title of the book
    private String authore; // Author of the book
    private int price; // Price of the book

    // Constructor to initialize the book
    public Book(String title, String authore, int price) {
        this.title = title;
        this.authore = authore;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Name of the Book: " + title);
        System.out.println("Author of the Book: " + authore);
        System.out.println("Price of the Book: " + price);
    }
}

// Main class to interact with the Book class
public class MainBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting user for book details
        System.out.println("Enter Name of the Book: ");
        String title = sc.nextLine();
        System.out.println("Enter Author of the Book: ");
        String authore = sc.nextLine();
        System.out.println("Enter Price of the Book: ");
        int price = sc.nextInt();

        // Creating a Book object with user-provided details
        Book bk = new Book(title, authore, price);

        // Displaying book details
        bk.displayDetails();

        sc.close(); // Closing the Scanner object
    }
}
