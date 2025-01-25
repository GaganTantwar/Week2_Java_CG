package com.tit.javainheritance.assistedproblem.animaldetails;

public class Cat extends Animal {
    protected String name; // This will shadow the name variable in Animal class
    protected String color;

    // Method to set the name and color of the cat
    public void setCat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Overriding the makeSound method for Cat
    @Override
    public void makeSound() {
        System.out.println("All Cat Say Meow");
    }

    // Method to get the name and color of the cat
    public void getCat() {
        System.out.println("Name of the Cat: " + name);
        System.out.println("Color of the Cat: " + color);
    }
}

