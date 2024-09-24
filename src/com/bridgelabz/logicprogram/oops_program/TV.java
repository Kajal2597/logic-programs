package com.bridgelabz.logicprogram.oops_program;

public class TV {

    // Instance variables
    private String brand;
    private int size;    // Size of the TV in inches
    private double price; // Price of the TV in dollars

    // Constructor to initialize TV object
    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    // Method to calculate the discount based on TV size
    public double calculateDiscount() {
        double discount;

        // Example discount calculation based on size
        if (size > 55) {
            discount = 0.15; // 15% discount for large TVs
        } else if (size > 40) {
            discount = 0.10; // 10% discount for medium-sized TVs
        } else {
            discount = 0.05; // 5% discount for smaller TVs
        }

        return price * discount;  // Discount amount
    }

    // Method to calculate the price after discount
    public double calculateDiscountedPrice() {
        return price - calculateDiscount();
    }

    // Method to print the TV's brand, size, and discounted price
    public void printTVDetails() {
        System.out.println("TV Brand: " + brand);
        System.out.println("TV Size: " + size + " inches");
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + calculateDiscountedPrice());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a TV object with specified brand, size, and price
        TV myTV = new TV("Samsung", 65, 1200);

        // Printing the TV's details
        myTV.printTVDetails();
    }
}

