package com.bridgelabz.logicprogram.Objects_MethodOverloading;

import java.util.Scanner;

public class Calculator {

    // Method to get input from the user
    public static void input() {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Call the add method and store the result
        double result = add(num1, num2);

        // Print the result of the addition
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to perform addition and return the result
    public static double add(double a, double b) {
        return a + b;  // Return the sum of two numbers
    }

    public static void main(String[] args) {
        // Call the input method to start the calculator
        input();
    }
}

/*
Explanation:
input() Method:

This method is responsible for getting user input using the Scanner class. It prompts the user to input two numbers.
After taking the input, it calls the add() method to perform the addition.
The result is then printed in the input() method.
add() Method:

This method accepts two parameters, a and b, which are the numbers entered by the user.
It returns the sum of the two numbers.
main() Method:

The main() method starts the program by calling the input() method.
 */
