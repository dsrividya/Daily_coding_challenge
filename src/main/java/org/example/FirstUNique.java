package org.example;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Map;

public class FirstUNique {

//    public static void firs(String s)
//    {
//        Map<Character, Integer> mp= new HashMap<>();
//        for(char c: s.toCharArray())
//        {
//            mp.put(c, mp.getOrDefault(c,0)+1);
//        }
//        System.out.println(mp);
//    }

    public static int firs(String s)
    {
        int[] ar= new int[256];
        char[] c=s.toCharArray();
        for(char se:c)
        {
            ar[se]++;
        }

        for(int i=0;i<=c.length-1;i++)
        {
            if(ar[c[i]]==1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s=" leetcode";
        System.out.println(firs(s));

    }
}
