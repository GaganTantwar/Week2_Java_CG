package com.tit.javainheritance.assistedproblem.animaldetails;

public class Animal {
    protected String name;
    protected int age;

    // Method to set the name and age of the animal
    public void setAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make a generic animal sound
    public void makeSound() {
        System.out.println("All Animal Make Sounds");
    }

    // Method to get the name and age of the animal
    public void getAnimal() {
        System.out.println("Name of the Animal: " + name);
        System.out.println("Age of the Animal: " + age);
    }
}
