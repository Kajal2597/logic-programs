package com.bridgelabz.logicprogram.oops_program;

public class Circle {

    // Instance variable
    private double radius;

    // Constructor to initialize Circle object
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to print the details of the circle
    public void printCircleDetails() {
        System.out.println("Radius of the Circle: " + radius);
        System.out.println("Area of the Circle: " + calculateArea());
        System.out.println("Circumference of the Circle: " + calculateCircumference());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Circle object with a given radius
        Circle circle = new Circle(5.0);

        // Printing the circle's details
        circle.printCircleDetails();
    }
}