package com.bridgelabz.logicprogram.Objects_MethodOverloading;

class AreaCalculator {

    // Method to calculate the area of a square (side * side)
    public double area(double side) {
        return side * side;
    }

    // Overloaded method to calculate the area of a rectangle (length * breadth)
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // Overloaded method to calculate the area of a circle (π * radius^2)
    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create an object of the AreaCalculator class
        AreaCalculator calculator = new AreaCalculator();

        // Calculate and print the area of a square
        double squareArea = calculator.area(5.0);  // Passing one argument for square
        System.out.println("Area of the square: " + squareArea);

        // Calculate and print the area of a rectangle
        double rectangleArea = calculator.area(5.0, 3.0);  // Passing two arguments for rectangle
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate and print the area of a circle
        double circleArea = calculator.area(7.0f);  // Passing one float argument for circle
        System.out.println("Area of the circle: " + circleArea);
    }
}
