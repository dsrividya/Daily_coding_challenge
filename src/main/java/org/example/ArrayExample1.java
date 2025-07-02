package org.example;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] n= new int[6];

        int[] newArray= Arrays.copyOf(n,n.length+6);
        System.out.println(Arrays.toString(newArray));

    }
}
