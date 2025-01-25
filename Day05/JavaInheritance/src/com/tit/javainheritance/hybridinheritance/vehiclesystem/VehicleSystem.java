package com.tit.javainheritance.hybridinheritance.vehiclesystem;

public class VehicleSystem {
    public static void main(String[] args) {
        // Create ElectricVehicle and PetrolVehicle objects
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(200, "Ford Mustang");

        // Demonstrate functionality
        ev.charge();
        pv.refuel();
    }
}
