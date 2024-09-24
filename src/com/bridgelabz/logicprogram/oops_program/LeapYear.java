package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any year: ");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println("Given year is Leap year");
        else
            System.out.println("Given year is not a leap year");
    }
}

