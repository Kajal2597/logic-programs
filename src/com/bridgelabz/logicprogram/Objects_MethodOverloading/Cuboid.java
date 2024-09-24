package com.bridgelabz.logicprogram.Objects_MethodOverloading;

import java.util.Scanner;

class Cuboid {

    // Instance variables for dimensions of the cuboid
    private double length, breadth, height;

    // Constructor to initialize the cuboid's dimensions
    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate the perimeter of the cuboid
    public double perimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the cuboid's base (rectangle): " + perimeter);
        return perimeter;
    }

    // Method to calculate the surface area of the cuboid, calls perimeter method
    public double area() {
        double perimeter = perimeter();  // Calling the perimeter method
        double area = 2 * (length * breadth + breadth * height + height * length);
        System.out.println("Surface area of the cuboid: " + area);
        return area;
    }

    // Method to calculate the volume of the cuboid, calls area method
    public double volume() {
        double area = area();  // Calling the area method
        double volume = length * breadth * height;
        System.out.println("Volume of the cuboid: " + volume);
        return volume;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input for dimensions of the cuboid
        System.out.print("Enter length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the cuboid: ");
        double breadth = scanner.nextDouble();

        System.out.print("Enter height of the cuboid: ");
        double height = scanner.nextDouble();

        // Create a Cuboid object
        Cuboid cuboid = new Cuboid(length, breadth, height);

        // Call the volume method (which will in turn call area and perimeter methods)
        cuboid.volume();

        // Close the scanner
        scanner.close();
    }
}
/*
Explanation:
Class Cuboid:

Instance Variables:
length, breadth, and height represent the dimensions of the cuboid.
Constructor:
Initializes the dimensions of the cuboid when an object is created.
perimeter() Method:
This method calculates and returns the perimeter of the cuboid's base (a rectangle).
It prints the result before returning the value.
area() Method:
This method first calls the perimeter() method to print and return the perimeter.
Then it calculates and prints the surface area of the cuboid.
volume() Method:
This method calls the area() method to calculate and print the surface area.
Finally, it calculates and prints the volume of the cuboid.
Nesting of Methods:

The volume() method calls the area() method.
The area() method calls the perimeter() method.
This method nesting allows the program to first calculate the perimeter, then the area, and finally the volume.
Main Method:

The main method prompts the user for the length, breadth, and height of the cuboid.
It creates a Cuboid object and calls the volume() method, which initiates the chain of method calls.
 */