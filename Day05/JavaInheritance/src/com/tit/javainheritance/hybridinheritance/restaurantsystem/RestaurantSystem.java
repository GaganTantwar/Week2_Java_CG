package com.tit.javainheritance.hybridinheritance.restaurantsystem;

public class RestaurantSystem {
    public static void main(String[] args) {
        // Create Chef and Waiter objects
        Worker chef = new Chef("John", 101);
        Worker waiter = new Waiter("Alice", 201);

        // Call performDuties method on each
        chef.performDuties();
        waiter.performDuties();
    }
}
