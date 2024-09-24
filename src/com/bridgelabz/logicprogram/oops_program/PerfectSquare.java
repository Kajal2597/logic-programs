package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int number = sc.nextInt();
        int sqrt = (int)Math.sqrt(number);
        if((sqrt*sqrt)==number)
            System.out.println("Given number is Perfect Square");
        else
            System.out.println("Given number is not a Perfect Square");
    }
}
