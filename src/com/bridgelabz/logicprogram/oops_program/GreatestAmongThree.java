package com.bridgelabz.logicprogram.oops_program;

public class GreatestAmongThree {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 2000;
        int num3 = 30;
        if(num1>num2 && num1>num3)
            System.out.println("Number1 is max");
        else if(num2>num1 && num2>num3)
            System.out.println("Number2 is max");
        else
            System.out.println("Number3 is max");
    }
}
