package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class NumberOfDivisior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any Number: ");
        int number = sc.nextInt();
        int x = 3;
        int cnt = 0;
        for(int i = 2; i<=number; i++)
        {
            if(number%i==0)
            {
                cnt++;
//                System.out.println(i);

            }
        }
//        System.out.println(cnt);
        if(cnt==x)
            System.out.println("Given number have exact divisors");
        else System.out.println("Given number does not have exact divisor");
    }
}
