package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int cnt = 0;
        for(int i=2; i<number; i++)
        {
            if(number%i==0)
                cnt++;
        }
        if(cnt==0)
            System.out.println("Given number is prime number");
        else
            System.out.println("Given number not a prime number");

    }
}
