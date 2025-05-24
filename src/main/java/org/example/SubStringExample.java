package org.example;

import java.sql.SQLOutput;

public class SubStringExample {

    public static void sub(int[] arr, int k)
    {
        int max=0;
        int window=0;
        if(arr.length<k)
        {
            System.out.println("invalid");
        }
        for(int i=0;i<k;i++)
        {
            max+= arr[i];
        }
        window=max;
        if(arr.length>k) {
            for (int i = k; i < arr.length; i++) {
                window += arr[i] - arr[i - k];

                max= Math.max(max,window);
            }

            System.out.println("Maximum sum of a subarray of size " + k + " is: " + max);

            }
        }
    public static void main(String[] args) {

        int[] arr= new int[]{1,2,3,5,4,3,2};
        int k=3;
        sub(arr, k);

    }
}
