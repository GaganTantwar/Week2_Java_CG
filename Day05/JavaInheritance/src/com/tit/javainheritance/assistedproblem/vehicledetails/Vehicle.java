package com.tit.javainheritance.assistedproblem.vehicledetails;

public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    // Constructor to initialize Vehicle details
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display Vehicle details
    public void display() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
