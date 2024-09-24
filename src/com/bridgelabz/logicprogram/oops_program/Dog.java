package com.bridgelabz.logicprogram.oops_program;

public class Dog {

    // Instance variables
    private String breed;
    private int age;
    private double weight;

    // Constructor to initialize Dog object
    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    // Method to calculate the dog's age in human years
    // Assuming 1 dog year = 7 human years
    public int calculateHumanYears() {
        return age * 7;
    }

    // Method to print the dog's breed, age, and weight
    public void printDogDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years (Dog Years)");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Age in Human Years: " + calculateHumanYears() + " years");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Dog object with specified breed, age, and weight
        Dog myDog = new Dog("Golden Retriever", 5, 30.5);

        // Printing the dog's details
        myDog.printDogDetails();
    }
}
