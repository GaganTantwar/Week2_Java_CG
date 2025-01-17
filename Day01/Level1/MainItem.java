import java.util.*; 

// Class representing an item
class Item {
    private int itemCode; // Code of the item
    private String itemName; // Name of the item
    private int price; // Price of the item
    private double totalCost; // Total cost of the item

    // Constructor to initialize the item
    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate the total cost based on quantity
    public void total(double quantity) {
        totalCost = price * quantity;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Code of the Item: " + itemCode);
        System.out.println("Name of the Item: " + itemName);
        System.out.println("Price of the Item: " + price);
        System.out.println("Total Cost of Item: " + totalCost);
    }
}

// Main class to interact with the Item class
public class MainItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting user for item details
        System.out.println("Enter Code of the Item: ");
        int itemCode = sc.nextInt();
        System.out.println("Enter Name of the Item: ");
        String itemName = sc.next();
        System.out.println("Enter Price of the Item: ");
        int price = sc.nextInt();
        System.out.println("Enter Quantity: ");
        double quantity = sc.nextDouble();

        // Creating an Item object with user-provided details
        Item item = new Item(itemCode, itemName, price);

        // Calculating total cost of the item based on quantity
        item.total(quantity);

        // Displaying item details
        item.displayDetails();

        sc.close(); // Closing the Scanner object
    }
}
