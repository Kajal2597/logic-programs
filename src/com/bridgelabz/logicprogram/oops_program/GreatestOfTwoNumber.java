package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class GreatestOfTwoNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int secondNum = sc.nextInt();
        if(firstNum>secondNum)
            System.out.println("First number is Greater than Second number");
        else
            System.out.println("Second number is Greater than First number");

    }
}
