package com.tit.javainheritance.multilevelinheritance.orderdetails;

public class ShippedOrder extends Order{
    protected int trackingNumber;

    // Constructor to initialize ShippedOrder details
    public ShippedOrder(String orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding the getOrderStatus method for ShippedOrder
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number of the Order: " + trackingNumber);
    }
}
