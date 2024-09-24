package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            number = number / 10;
        }

        System.out.println("Sum of factorials: " + sum);
        if (originalNumber == sum) {
            System.out.println("Number is a Strong Number");
        } else {
            System.out.println("Number is Not a Strong Number");
        }


    }
}
