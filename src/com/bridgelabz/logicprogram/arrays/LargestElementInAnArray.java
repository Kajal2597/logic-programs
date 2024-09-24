package com.bridgelabz.logicprogram.arrays;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] a={1,2,3,46,8,9,45,10};

        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Largest Element In array: "+max);
    }
}
