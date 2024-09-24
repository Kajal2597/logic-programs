package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class SumOfGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start range: ");
        int startRange = sc.nextInt();
        System.out.println("Enter the end range: ");
        int endRange = sc.nextInt();
        int sum = 0;
        for(int i=startRange; i<=endRange; i++)
        {
            sum+=i;
        }
        System.out.println("Sum of Given range is: "+sum);

    }
}
