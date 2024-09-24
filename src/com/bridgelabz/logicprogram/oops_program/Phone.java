package com.bridgelabz.logicprogram.oops_program;

public class Phone {

    // Instance variables
    private String make;
    private String model;
    private int storage;  // Storage in GB

    // Constructor to initialize Phone object
    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    // Method to calculate the price of the phone based on make, model, and storage
    public double calculatePrice() {
        double basePrice;

        // Example price calculation based on make and model
        if (make.equalsIgnoreCase("Apple")) {
            basePrice = 1000; // Base price for Apple phones
        } else if (make.equalsIgnoreCase("Samsung")) {
            basePrice = 800; // Base price for Samsung phones
        } else {
            basePrice = 500; // Base price for other phones
        }

        // Adjusting price based on storage capacity
        if (storage > 128) {
            basePrice += 200;  // Additional price for high storage models
        } else if (storage > 64) {
            basePrice += 100;  // Additional price for mid-range storage models
        }

        return basePrice;
    }

    // Method to print the phone's make, model, and storage capacity
    public void printPhoneDetails() {
        System.out.println("Phone Make: " + make);
        System.out.println("Phone Model: " + model);
        System.out.println("Storage Capacity: " + storage + "GB");
        System.out.println("Price: $" + calculatePrice());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Phone object with specified make, model, and storage
        Phone myPhone = new Phone("Apple", "iPhone 13", 256);

        // Printing the phone's details
        myPhone.printPhoneDetails();
    }
}
