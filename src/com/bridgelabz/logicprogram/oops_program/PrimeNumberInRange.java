package com.bridgelabz.logicprogram.oops_program;

import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Range: ");
        int startRange = sc.nextInt();
        System.out.println("Enter Ending Range: ");
        int endRange = sc.nextInt();

        for(int i=startRange; i<endRange; i++)
        {
            int cnt  = 0;

            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    cnt++;
                }
            }
            if(cnt==0)
                System.out.print(i+" ");
        }
    }
}
