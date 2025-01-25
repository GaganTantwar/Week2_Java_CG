package com.tit.javainheritance.assistedproblem.vehicledetails;

public class Car extends Vehicle {
    protected static String vehicleType = "Car";
    protected int seats;

    // Constructor to initialize Car details
    public Car(int maxSpeed, String fuelType, int seats) {
        super(maxSpeed, fuelType);
        this.seats = seats;
    }

    // Overriding the display method for Car
    @Override
    public void display() {
        super.display();
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Seats in Car: " + seats);
    }
}
