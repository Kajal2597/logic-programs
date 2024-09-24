package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class FindMonthYearDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number of days: ");
        int days = sc.nextInt();

        int year = days/365;
        int remainingDays = days%365;
        System.out.println(year);

        int month = remainingDays/30;
        int remainingDays2 = remainingDays%30;
        System.out.println(month);

        int weeks = remainingDays2/7;
        int day = remainingDays2%7;

        System.out.println(weeks);
        System.out.println(day);
    }
}
