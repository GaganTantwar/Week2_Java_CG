package com.tit.javainheritance.hybridinheritance.vehiclesystem;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Charge method
    public void charge() {
        System.out.println(model + " is charging.");
    }
}
