package com.tit.javainheritance.assistedproblem.vehicledetails;

public class Truck extends Vehicle{
    protected static String vehicleType = "Truck";
    protected int maxLoad;

    // Constructor to initialize Truck details
    public Truck(int maxSpeed, String fuelType, int maxLoad) {
        super(maxSpeed, fuelType);
        this.maxLoad = maxLoad;
    }

    // Overriding the display method for Truck
    @Override
    public void display() {
        super.display();
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Max Load of Truck: " + maxLoad);
    }
}
