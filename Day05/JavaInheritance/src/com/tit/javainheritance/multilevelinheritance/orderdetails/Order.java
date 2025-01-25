package com.tit.javainheritance.multilevelinheritance.orderdetails;

public class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor to initialize Order details
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the order status
    public void getOrderStatus() {
        System.out.println("Order Id of the Order: " + orderId);
        System.out.println("Order Date of the Order: " + orderDate);
    }
}
