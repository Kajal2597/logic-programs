package com.bridgelabz.logicprogram.arrays;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,4,5,6,6};

        for(int i=0; i<a.length; i++)
        {
            int cnt = 0;
            for(int j=0; j<i; j++)
            {
                if(a[i]==a[j])
                {
                    cnt++;
                }
            }
            if(cnt==0)
            {
                int count = 0;
                for(int k=0; k<a.length; k++)
                {
                    if(a[i]==a[k])
                    {
                        count++;
                    }
                }

                System.out.println(a[i]+" "+count);
            }
        }
    }
}
