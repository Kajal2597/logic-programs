package com.bridgelabz.logicprogram.oops_program;

public class Repalce1by0 {
    public static void main(String[] args) {
        int[] a={1,2,1,2,1,2};
        for (int i =0; i<a.length; i++)
        {
            if(a[i]==1)
                a[i]=0;
        }
        for (int i=0; i< a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
