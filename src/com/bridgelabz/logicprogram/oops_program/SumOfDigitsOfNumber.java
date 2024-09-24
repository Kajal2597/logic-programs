package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        int sumOfDigits = 0;
        while(number>0)
        {
            int rem =  number%10;
            number = number/10;
            sumOfDigits+=rem;
        }
        System.out.println("Sum of Digits is: "+sumOfDigits);
    }
}
