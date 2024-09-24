package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        String hexadecimal = Integer.toHexString(number);
        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
    }
}
