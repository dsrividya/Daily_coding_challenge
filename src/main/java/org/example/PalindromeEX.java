package org.example;

public class PalindromeEX {
    public static void main(String[] args) {
        String s=" ratrcar";
        String v=" ";
        for(int i=s.length()-1;i>0;i--)
        {
            v+=s.charAt(i);
        }
        if(s.toLowerCase().equals(v.toLowerCase()))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
