package librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create different library items
        Library book = new Book("B001", "Java Programming", "John Doe");
        Library magazine = new Magazine("M001", "Tech Monthly", "Jane Smith");
        Library dvd = new DVD("D001", "The Matrix", "Wachowski Brothers");

        // Display item details and loan duration using polymorphism
        Library[] items = {book, magazine, dvd};
        for (Library item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("------------------------");
        }

        // Reserve items

        book.reserveItem("Alice");


        magazine.reserveItem("Bob");


        dvd.reserveItem("Charlie");

        // Check availability
        System.out.println("Book availability: " + book.checkAvailability());
        System.out.println("Magazine availability: " + magazine.checkAvailability());
        System.out.println("DVD availability: " + dvd.checkAvailability());
    }
}
