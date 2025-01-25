package com.tit.javainheritance.multilevelinheritance.orderdetails;

public class OrderDetails {
    public static void main(String args[]) {
        // Creating an instance of Order
        Order order = new Order("OID521", "22-01-2025");
        order.getOrderStatus();
        System.out.println(" ");

        // Creating an instance of ShippedOrder
        ShippedOrder shipped = new ShippedOrder("OID521", "22-01-2025", 12356);
        shipped.getOrderStatus();
        System.out.println(" ");

        // Creating an instance of DeliveryOrder
        DeliveryOrder item2 = new DeliveryOrder("OID521", "22-01-2025", 12356, "24-01-2025");
        item2.getOrderStatus();
    }

}
