package com.bridgelabz.logicprogram.Objects_MethodOverloading;

import java.util.Scanner;

public class ByteSum {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two byte values
        System.out.print("Enter first byte value: ");
        byte byteValue1 = scanner.nextByte();

        System.out.print("Enter second byte value: ");
        byte byteValue2 = scanner.nextByte();

        // Type casting byte values to int before performing the addition
        int sum = (int) byteValue1 + (int) byteValue2;

        // Print the result
        System.out.println("Sum of the two byte values: " + sum);

        // Close the scanner
        scanner.close();
    }
}
/*
Explanation:
Byte Input:

The program takes two byte values as input using the Scanner.nextByte() method.
Since byte values are limited to the range from -128 to 127, it ensures that input stays within this range.
Type Casting:

Before performing the addition, the two byte values are type cast to int to avoid potential overflow and to safely compute the sum.
The cast is explicit: (int) byteValue1 + (int) byteValue2.
Sum Calculation:

After casting, the sum of the two int values is calculated and stored in the sum variable.
Output:

The result of the addition is printed to the console.
 */