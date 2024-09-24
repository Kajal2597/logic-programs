package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int reverseNumber = 0;

        while(number>0)
        {
            int rem = number%10;
            number/=10;
            reverseNumber = reverseNumber*10+rem;
        }
        System.out.println("After : "+reverseNumber);
    }
}
