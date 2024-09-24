package com.bridgelabz.logicprogram.oops_program;

class Furniture {
    // Instance variables
    private String type;
    private String material;
    private double price;

    // Constructor to initialize the variables
    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    // Method to calculate the discount based on the material
    public double calculateDiscount() {
        double discountPercentage = 0;

        // Adjusting the discount based on the material
        switch (this.material.toLowerCase()) {
            case "wood":
                discountPercentage = 10;  // 10% discount for wood
                break;
            case "metal":
                discountPercentage = 5;  // 5% discount for metal
                break;
            case "plastic":
                discountPercentage = 2;  // 2% discount for plastic
                break;
            default:
                discountPercentage = 3;  // 3% discount for other materials
                break;
        }

        // Discounted price = price - (discount percentage of price)
        double discountAmount = (discountPercentage / 100) * this.price;
        return this.price - discountAmount;
    }

    // Method to print the furniture's details and the discounted price
    public void printDetails() {
        System.out.println("Furniture Type: " + this.type);
        System.out.println("Material: " + this.material);
        System.out.println("Original Price: $" + this.price);
        System.out.println("Discounted Price: $" + calculateDiscount());
    }

    public static void main(String[] args) {
        // Create a Furniture object
        Furniture chair = new Furniture("Chair", "Wood", 200);

        // Print furniture details including the discounted price
        chair.printDetails();
    }
}
