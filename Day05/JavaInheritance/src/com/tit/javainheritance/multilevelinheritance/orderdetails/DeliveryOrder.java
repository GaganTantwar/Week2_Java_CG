package com.tit.javainheritance.multilevelinheritance.orderdetails;

public class DeliveryOrder extends ShippedOrder{
    protected String deliveryDate;

    // Constructor to initialize DeliveryOrder details
    public DeliveryOrder(String orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding the getOrderStatus method for DeliveryOrder
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date Of the Order: " + deliveryDate);
    }
}
