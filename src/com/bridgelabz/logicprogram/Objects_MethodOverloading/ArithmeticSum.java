package com.bridgelabz.logicprogram.Objects_MethodOverloading;

public class ArithmeticSum {

    // Method to find the sum of 2 variables
    public int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method to find the sum of 3 variables
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to find the sum of 4 variables
    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        // Create an object of ArithmeticSum class
        ArithmeticSum arithmeticSum = new ArithmeticSum();

        // Calling the sum method with 2 arguments
        int result1 = arithmeticSum.sum(10, 20);
        System.out.println("Sum of 2 variables: " + result1);

        // Calling the sum method with 3 arguments
        int result2 = arithmeticSum.sum(10, 20, 30);
        System.out.println("Sum of 3 variables: " + result2);

        // Calling the sum method with 4 arguments
        int result3 = arithmeticSum.sum(10, 20, 30, 40);
        System.out.println("Sum of 4 variables: " + result3);
    }
}
/*
Explanation:
Method Overloading:

Method overloading occurs when multiple methods in the same class have the same name but differ in the number or type of parameters.
In this case, we have three overloaded methods named sum:
sum(int a, int b) - to calculate the sum of 2 variables.
sum(int a, int b, int c) - to calculate the sum of 3 variables.
sum(int a, int b, int c, int d) - to calculate the sum of 4 variables.
Sum Calculations:

Depending on the number of arguments passed, the appropriate overloaded method is called.
For example, when you pass 2 arguments to the sum() method, the method with 2 parameters is called. Similarly, when you pass 3 or 4 arguments, the respective overloaded methods are called.
main() Method:

The main() method creates an object of the ArithmeticSum class.
It then calls the overloaded sum() method three times, with different numbers of arguments (2, 3, and 4), to demonstrate method overloading.
 */