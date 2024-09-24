package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

class Computer {
    // Instance variables
    private String processor;
    private int ram;  // in GB
    private int storage;  // in GB

    // Constructor to initialize the variables
    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    // Method to calculate the price of the computer
    public double calculatePrice() {
        double basePrice = 300;  // Base price for any computer
        double processorCost = 0;
        double ramCost = 50 * this.ram;  // Assume each GB of RAM costs $50
        double storageCost = 0.10 * this.storage;  // Assume each GB of storage costs $0.10

        // Adjusting the processor price
        switch (this.processor.toLowerCase()) {
            case "i3":
                processorCost = 100;
                break;
            case "i5":
                processorCost = 200;
                break;
            case "i7":
                processorCost = 300;
                break;
            default:
                processorCost = 150;  // Generic processor cost
                break;
        }

        // Total price = base price + processor cost + RAM cost + storage cost
        return basePrice + processorCost + ramCost + storageCost;
    }

    // Method to print the computer's specifications
    public void printSpecifications() {
        System.out.println("Processor: " + this.processor);
        System.out.println("RAM: " + this.ram + " GB");
        System.out.println("Storage: " + this.storage + " GB");
    }

    public static void main(String[] args) {
        // Create a Computer object
        Scanner sc =new Scanner(System.in);
        System.out.println("enter processor name");
        String processor=sc.next();

        System.out.println("enter ram name");
        int ram=sc.nextInt();
        System.out.println("enter storage name");
        int storage=sc.nextInt();
        Computer myComputer = new Computer(processor,ram,storage);

        // Print computer specifications
        myComputer.printSpecifications();

        // Calculate and print the price
        double price = myComputer.calculatePrice();
        System.out.println("Price: $" + price);
    }
}
