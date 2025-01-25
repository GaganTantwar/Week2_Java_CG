package com.tit.javainheritance.singleinheritance.devicesystem;

public class Thermostat extends Device{
    private double temperatureSetting;

    // Constructor
    public Thermostat(int deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Getter and Setter for temperatureSetting


    // Override displayStatus to include temperatureSetting
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
