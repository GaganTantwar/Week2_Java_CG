package com.tit.javainheritance.assistedproblem.vehicledetails;

public class VehicleDetails {
    public static void main(String args[]) {
        // Creating instances of different vehicles
        Vehicle bolero = new Car(180, "Diesel", 8);
        Vehicle tanker = new Truck(100, "Diesel", 5000);
        Vehicle delux = new MotorCycle(100, "Petrol", 4);

        // Storing vehicles in an array
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bolero;
        vehicles[1] = tanker;
        vehicles[2] = delux;

        // Displaying details of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.display();
            System.out.println(" ");
        }
    }
}
