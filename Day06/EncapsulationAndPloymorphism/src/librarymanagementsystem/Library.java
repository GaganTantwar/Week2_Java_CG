package librarymanagementsystem;

public abstract class Library implements Reservable{
    private String itemId; // Unique identifier for the library item
    private String title;  // Title of the item
    private String author; // Author of the item

    // Constructor to initialize item details
    public Library(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter methods for item details
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
