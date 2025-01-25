package com.tit.javainheritance.hybridinheritance.restaurantsystem;

public class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (ID: " + id + ") is preparing meals.");
    }
}
