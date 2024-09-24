package com.bridgelabz.logicprogram.Objects_MethodOverloading;

import java.util.Scanner;

// Class to represent a shape
public class Shape {
    double length, breadth;
    double base, height;

    // Constructor for rectangle
    Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor for triangle
    Shape(double base, double height, boolean isTriangle) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double areaOfRectangle() {
        return length * breadth;
    }

    // Method to calculate the area of the triangle
    public double areaOfTriangle() {
        return 0.5 * base * height;
    }
}

class AreaCalculator {

    // Method to calculate area for a rectangle by passing the object
    public static Shape calculateRectangleArea(Shape rectangle) {
        double area = rectangle.areaOfRectangle();
        System.out.println("Area of the rectangle: " + area);
        return rectangle; // Return the object
    }

    // Method to calculate area for a triangle by passing the object
    public static Shape calculateTriangleArea(Shape triangle) {
        double area = triangle.areaOfTriangle();
        System.out.println("Area of the triangle: " + area);
        return triangle; // Return the object
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input for rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Create a Shape object for rectangle and pass it to the method
        Shape rectangle = new Shape(length, breadth);
        calculateRectangleArea(rectangle);

        // Input for triangle
        System.out.print("\nEnter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();

        // Create a Shape object for triangle and pass it to the method
        Shape triangle = new Shape(base, height, true);
        calculateTriangleArea(triangle);

        // Close the scanner
        scanner.close();
    }
}
/*
Explanation:
Shape Class:

This class has two constructors:
One for the rectangle, which takes length and breadth as input.
Another for the triangle, which takes base and height.
Two methods are provided to calculate the area: areaOfRectangle() for the rectangle and areaOfTriangle() for the triangle.
AreaCalculator Class:

The main class that contains the main() method, and two methods: calculateRectangleArea() and calculateTriangleArea().
These methods receive Shape objects, calculate the respective areas, and print the results.
They also return the object back to the caller (in this case, the main() method).
main() Method:

The main() method first takes user input for the dimensions of the rectangle, creates a Shape object, and passes it to the calculateRectangleArea() method.
Similarly, it takes input for the dimensions of the triangle, creates another Shape object, and passes it to the calculateTriangleArea() method.
Passing and Returning Objects:

The Shape objects are passed to the respective methods, and after calculating the area, the objects are returned back to the main method (although returning is not strictly necessary in this case).
 */