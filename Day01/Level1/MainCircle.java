import java.util.*;

// Class representing a circle
class Circle{
    private double radius; // Radius of the circle
    private double pi; // Value of pi
    public double area; // Area of the circle
    public double perimeter; // Perimeter of the circle

    // Constructor to initialize the circle
    public Circle(double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    // Method to calculate the area of the circle
    public void calculateArea() {
        area = pi * (radius * radius);
    }

    // Method to calculate the perimeter of the circle
    public void calculatePerimeter() {
        perimeter = 2 * pi * radius;
    }

    // Method to display the details of the circle
    public void displayDetails() {
        System.out.println("Area of a Circle: " + area);
        System.out.println("Perimeter of a Circle: " + perimeter);
    }
}

// Main class to interact with the Circle class
public class MainCircle{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting user for the radius of the circle
        System.out.println("Enter Radius Of Circle:");
        double radius = sc.nextDouble();
        double pi = 3.14; // Value of pi

        // Creating a Circle object with user-provided radius and value of pi
        Circle cir = new Circle(radius, pi);

        // Calculating area and perimeter of the circle
        cir.calculateArea();
        cir.calculatePerimeter();

        // Displaying the details of the circle
        cir.displayDetails();

        sc.close(); // Closing the Scanner object
    }
}
