package com.tit.javainheritance.singleinheritance.devicesystem;

public class DeviceSystem {
    public static void main(String[] args) {
        // Create a general Device object
        Device device = new Device(101, "Online");
        device.displayStatus();

        // Create a Thermostat object
        Thermostat thermostat = new Thermostat(202, "Active", 22.5);
        thermostat.displayStatus();
    }

}
