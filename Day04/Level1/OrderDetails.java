import java.util.*;

// Class representing a Product
class Product {
    private String productName;
    private final String productId;
    private int productPrice;

    // Constructor to initialize Product object
    public Product(String productName, String productId, int productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    // Getter method for product name
    public String getName() {
        return productName;
    }

    // Getter method for product ID
    public String getId() {
        return productId;
    }

    // Getter method for product price
    public int getPrice() {
        return productPrice;
    }
}

// Class representing an Order
class Order {
    private String deliveryAddress;
    private final String orderId;
    private ArrayList<Product> products;

    // Constructor to initialize Order object
    public Order(String deliveryAddress, String orderId) {
        this.deliveryAddress = deliveryAddress;
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Getter method for delivery address
    public String getAddress() {
        return deliveryAddress;
    }

    // Getter method for order ID
    public String getId() {
        return orderId;
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        
       
    }

    // Method to display order details and its products
    public void display() {
        System.out.println("Address of the Order: \"" + deliveryAddress + "\" Order Id: \"" + orderId + "\"");
        for (Product product : products) {
            System.out.println("Product Name: \"" + product.getName() + "\" Product Id: \"" + product.getId() + "\" Price of the Product: \"" + product.getPrice() + "\"");
        }
    }
}

// Class representing a Customer
class Customer {
    public String customerName;
    private ArrayList<Order> orders;

    // Constructor to initialize Customer object
    public Customer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    // Method to add an order to the customer
    public void addOrder(Order order) {
        orders.add(order);
       
       
    }

    // Method to display customer details and their orders
    public void display() {
        System.out.println("Name of the Customer: \"" + customerName + "\"");
        for (Order order : orders) {
            order.display();
            System.out.println(" ");
        }
    }

    
}

// Main class to demonstrate the functionality
public class OrderDetails {
    public static void main(String args[]) {
        // Creating products
        Product product1 = new Product("Trimmer", "PID908", 500);
        Product product2 = new Product("Facial Cream", "PID526", 200);
        Product product3 = new Product("Hair Wax", "PID506", 100);

        System.out.println(" ");

        // Creating orders and adding products to them
        Order order1 = new Order("Krishak Nagar", "OID19");
        Order order2 = new Order("Anand Nagar", "OID15");
        order1.addProduct(product1);
        order1.addProduct(product2);
        System.out.println(" ");
        order2.addProduct(product3);

        // Creating customers and adding orders to them
        Customer customer1 = new Customer("Gagan Tantwar");
        Customer customer2 = new Customer("Raj Srivastav");
       
        customer1.addOrder(order1);
        customer2.addOrder(order2);

        // Displaying customer details
        customer1.display();
        customer2.display();
    }
}
