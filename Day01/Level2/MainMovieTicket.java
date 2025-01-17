import java.util.*; // Importing the Scanner class for user input

// Class representing a movie ticket
class MovieTicket {
    private int seatNumber; // Seat number
    private String movieName; // Name of the movie
    private int price; // Price of the ticket

    // Constructor to initialize the movie ticket
    public MovieTicket(int seatNumber, String movieName, int price) {
        this.seatNumber = seatNumber;
        this.movieName = movieName;
        this.price = price;
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Seat is Booked");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Price: " + price);
    }
}

// Main class to interact with the MovieTicket class
public class MainMovieTicket {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting user for ticket details
        System.out.println("Enter Seat Number:");
        int seatNumber = sc.nextInt();
        System.out.println("Enter Movie Name:");
        String movieName = sc.next();
        System.out.println("Enter Price:");
        int price = sc.nextInt();

        // Creating a MovieTicket object with user-provided details
        MovieTicket ticket = new MovieTicket(seatNumber, movieName, price);

        // Displaying ticket details
        ticket.displayDetails();

        sc.close(); // Closing the Scanner object
    }
}
