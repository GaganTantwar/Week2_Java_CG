package com.tit.javainheritance.assistedproblem.vehicledetails;

public class MotorCycle extends Vehicle{
    protected static String vehicleType = "MotorCycle";
    protected int gears;

    // Constructor to initialize MotorCycle details
    public MotorCycle(int maxSpeed, String fuelType, int gears) {
        super(maxSpeed, fuelType);
        this.gears = gears;
    }

    // Overriding the display method for MotorCycle
    @Override
    public void display() {
        super.display();
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Gears in MotorCycle: " + gears);
    }
}
