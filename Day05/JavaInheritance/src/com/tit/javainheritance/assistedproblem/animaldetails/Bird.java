package com.tit.javainheritance.assistedproblem.animaldetails;

public class Bird extends Animal {
    protected String name; // This will shadow the name variable in Animal class
    protected String species;

    // Method to set the name and species of the bird
    public void setBird(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Overriding the makeSound method for Bird
    @Override
    public void makeSound() {
        System.out.println("Different Birds make different Sound");
    }

    // Method to get the name and species of the bird
    public void getBird() {
        System.out.println("Name of the Bird: " + name);
        System.out.println("Species of Bird: " + species);
    }
}
