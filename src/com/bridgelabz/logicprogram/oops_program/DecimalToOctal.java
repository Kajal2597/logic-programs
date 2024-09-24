package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        String octal = Integer.toOctalString(number);
        System.out.println("Octal: " + octal);
    }
}
