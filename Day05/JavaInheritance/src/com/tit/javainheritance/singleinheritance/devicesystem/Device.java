package com.tit.javainheritance.singleinheritance.devicesystem;

public class Device {
    protected int deviceId;
    protected String status;

    // Constructor
    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }



    // Method to display status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}
