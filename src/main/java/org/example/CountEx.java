package org.example;

public class CountEx {
    public static void coun(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String s="sri vidya";
        coun(s);
    }
}
