package com.bridgelabz.logicprogram.arrays;

import java.util.Arrays;

public class SecondMaxElementInAnArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,9,10};
//        Arrays.sort(a);
//        int max2 = a.length-1;
//        System.out.println(max2);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max1)
                max1=a[i];
        }

        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max2 && a[i]!=max1)
                max2=a[i];
        }

        System.out.println("Second Max Element is : "+max2);
    }
}
