package org.example;
import java.util.*;

public class Reverse {

    public static void rev(String s)
    {

        StringBuilder str= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            str.append(s.charAt(i));

        }
        System.out.println(str.toString().trim());
    }
    public static void main(String[] args) {
          String s=" hi blue";
          rev(s);
    }
}
