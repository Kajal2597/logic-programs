package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        String number = sc.next();
        int decimalNumber = Integer.parseInt(number,2);
        System.out.println("Decimal: "+decimalNumber);
    }
}
