package com.tit.javainheritance.hybridinheritance.vehiclesystem;

public class PetrolVehicle extends Vehicle implements Refuelable1  {
    // Constructor
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implementation of refuel method
    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}
