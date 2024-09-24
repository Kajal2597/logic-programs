package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int cnt = 0;
        int sum = 0;
        while (number>0)
        {
            number = number/10;
            cnt++;
            
        }
        number=originalNumber;
        while (number>0)
        {
            int rem = number%10;
            sum = sum+(int)Math.pow(rem,cnt);
            number = number/10;
        }
        if(sum==originalNumber)
            System.out.println("Given number is ArmStrong Number");
        else
            System.out.println("Given number is not is Armstrong Number");
    }
}
