import java.util.*; // Importing the Scanner class for user input

// Class representing a mobile phone
class MobilePhone {
    private String brand; // Brand of the mobile phone
    private String model; // Model of the mobile phone
    private int price; // Price of the mobile phone

    // Constructor to initialize the mobile phone
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand of the Mobile: " + brand);
        System.out.println("Model of the Mobile: " + model);
        System.out.println("Price of the Mobile: " + price);
    }
}

// Main class to interact with the MobilePhone class
public class MainMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting user for the number of brands they know
        System.out.println("Enter Number Of Brands You Know:");
        int n = sc.nextInt();

        // Looping through each brand to get details
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Details of Brand " + i + ":");
            System.out.println("Enter Brand of the Mobile: ");
            String brand = sc.next();
            System.out.println("Enter Model of the Mobile: ");
            String model = sc.next();
            System.out.println("Enter Price of the Mobile: ");
            int price = sc.nextInt();

            // Creating a MobilePhone object with user-provided details
            MobilePhone phone = new MobilePhone(brand, model, price);

            // Displaying mobile phone details
            phone.displayDetails();
            System.out.println(" ");
        }

        sc.close(); // Closing the Scanner object
    }
}
