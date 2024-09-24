package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class OccurrenceOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        System.out.println("Enter any digit which you have to check how any times it is repeat: ");
        int x = sc.nextInt();
        int cnt  = 0;
        while (number>0)
        {
            int rem = number%10;
            if(rem==x)
            {
                cnt++;
            }
            number=number/10;
        }
        System.out.println("The digits repeating "+cnt+" times");
    }
}