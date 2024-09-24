package com.bridgelabz.logicprogram.arrays;

public class DuplicateElementInAnArray {
    public static void main(String[] args) {
        int[] a ={1,2,5,3,6,8,2,5,6,3};

        for(int i = 0; i< a.length; i++)
        {
            int cnt = 0;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]==a[j])
                {
                    cnt++;
                }
            }

            if(cnt!=0)
                System.out.print(a[i]+" ");
        }
    }
}
