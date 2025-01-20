class Vehicle {
    // Static variable to store the registration fees (shared among all instances)
    private static int registrationFees = 5000;
    // Private instance variables to store the registration number, owner name, and vehicle type
    private String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize the registration number, owner name, and vehicle type
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the registration fees
    public static void updateRegistrationFee(int fees) {
        registrationFees = fees;
    }

    // Method to display the vehicle details
    public void display() {
        System.out.println("Owner Name of Vehicle: " + ownerName);
        System.out.println("Registration Number of Vehicle: " + registrationNumber);
        System.out.println("Vehicle type of Vehicle: " + vehicleType);
        System.out.println("Vehicle Registration Charges: " + registrationFees);
    }
}

public class VehicleDetails {
    public static void main(String args[]) {
        // Creating two instances of Vehicle with different registration numbers, owner names, and vehicle types
        Vehicle vehicle1 = new Vehicle("MP-04-ZJ-2816", "Raju Singh", "SUV Car");
        Vehicle vehicle2 = new Vehicle("MP-04-LK-9887", "Rajesh Singh", "Mountain Bike");

        // Checking if vehicle1 is an instance of Vehicle and displaying its details
        if (vehicle1 instanceof Vehicle) {
            vehicle1.display();
        }
        System.out.println("\n");

        // Checking if vehicle2 is an instance of Vehicle and displaying its details
        if (vehicle2 instanceof Vehicle) {
            vehicle2.display();
        }
        System.out.println("\n");

        // Updating the registration fees
        Vehicle.updateRegistrationFee(5500);

        // Displaying the details again to show the updated registration fees
        if (vehicle1 instanceof Vehicle) {
            vehicle1.display();
        }
        System.out.println("\n");

        if (vehicle2 instanceof Vehicle) {
            vehicle2.display();
        }
    }
}
