package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int reverseNumber = 0;

        while(number>0)
        {
            int rem = number%10;
            number/=10;
            reverseNumber = reverseNumber*10+rem;
        }

        if(originalNumber==reverseNumber)
          System.out.println("given number is palindrom number");
        else
            System.out.println("Given number is not palindrom number");
    }
}
