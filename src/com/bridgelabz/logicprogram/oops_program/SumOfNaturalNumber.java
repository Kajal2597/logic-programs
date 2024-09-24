package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range upto have the sum of natural numbers: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++)
        {
            sum+=i;
        }
        System.out.println("Sum of Natural numbers is : "+sum);
    }
}
