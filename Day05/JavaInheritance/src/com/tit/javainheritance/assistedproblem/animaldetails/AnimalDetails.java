package com.tit.javainheritance.assistedproblem.animaldetails;

public class AnimalDetails {
    public static void main(String args[]) {
        // Creating an instance of Animal
        Animal tom = new Animal();
        tom.setAnimal("Thomas", 14);
        tom.makeSound();
        tom.getAnimal();
        System.out.println(" ");

        // Creating an instance of Dog
        Dog spike = new Dog();
        spike.setDog("Spike", "German Shepherd");
        spike.makeSound();
        spike.getDog();
        System.out.println(" ");

        // Creating an instance of Cat
        Cat mechan = new Cat();
        mechan.setCat("Mechan", "White");
        mechan.makeSound();
        mechan.getCat();
        System.out.println(" ");

        // Creating an instance of Bird
        Bird crow = new Bird();
        crow.setBird("Raven", "Black Crow");
        crow.makeSound();
        crow.getBird();
    }
}
