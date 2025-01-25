package com.tit.javainheritance.assistedproblem.animaldetails;

public class Dog extends Animal {
    protected String name; // This will shadow the name variable in Animal class
    protected String breed;

    // Method to set the name and breed of the dog
    public void setDog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Overriding the makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("All Dog bark");
    }

    // Method to get the name and breed of the dog
    public void getDog() {
        System.out.println("Name of the Dog: " + name);
        System.out.println("Breed of the Dog: " + breed);
    }
}

