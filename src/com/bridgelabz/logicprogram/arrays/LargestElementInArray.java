package com.bridgelabz.logicprogram.arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] a ={1,2,0,3,5,4};
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Smallest Element in Array is : "+min);
    }
}
