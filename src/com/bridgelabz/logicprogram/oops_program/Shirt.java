package com.bridgelabz.logicprogram.oops_program;

class Shirt {
    // Instance variables
    private String size;
    private String color;
    private double price;

    // Constructor to initialize the variables
    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    // Method to calculate the discount based on the size
    public double calculateDiscount() {
        double discountPercentage = 0;

        // Adjusting the discount based on the size
        switch (this.size.toLowerCase()) {
            case "small":
                discountPercentage = 5;  // 5% discount for small size
                break;
            case "medium":
                discountPercentage = 10;  // 10% discount for medium size
                break;
            case "large":
                discountPercentage = 15;  // 15% discount for large size
                break;
            default:
                discountPercentage = 3;  // 3% discount for other sizes
                break;
        }

        // Discounted price = price - (discount percentage of price)
        double discountAmount = (discountPercentage / 100) * this.price;
        return this.price - discountAmount;
    }

    // Method to print the shirt's size, color, and discounted price
    public void printDetails() {
        System.out.println("Shirt Size: " + this.size);
        System.out.println("Shirt Color: " + this.color);
        System.out.println("Original Price: $" + this.price);
        System.out.println("Discounted Price: $" + calculateDiscount());
    }

    public static void main(String[] args) {
        // Create a Shirt object
        Shirt shirt1 = new Shirt("Medium", "Blue", 50);

        // Print shirt details including the discounted price
        shirt1.printDetails();
    }
}

/*
Explanation:
Instance Variables:

size: Represents the size of the shirt (e.g., Small, Medium, Large).
color: Represents the color of the shirt (e.g., Blue, Red).
price: Represents the original price of the shirt.
Constructor: Initializes the size, color, and price values when a new object is created.

calculateDiscount():

Calculates the discount based on the shirt's size.
Discounts vary depending on the size (e.g., 5% for small, 10% for medium, 15% for large).
Returns the final price after applying the discount.
printDetails():

Prints the shirt's size, color, original price, and the discounted price by calling calculateDiscount().
main():

A Shirt object is created with specific values for size, color, and price.
The printDetails() method is called to display the shirt's details along with the discounted price.
 */
