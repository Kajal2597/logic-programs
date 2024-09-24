package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number: ");
            int number = sc.nextInt();
            String binaryNumber = Integer.toBinaryString(number);
            System.out.println("Binary: "+binaryNumber);
    }
}
