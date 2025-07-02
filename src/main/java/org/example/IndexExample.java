package org.example;

public class IndexExample {
    public static void ind(String s, String y)
    {
        if(s.length()<y.length())
        {
            System.out.println("null");
        }
        for (int i = 0; i <= s.length() - y.length(); i++) {
            if (s.substring(i, i + y.length()).equals(y)) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }


    public static void main(String[] args) {
        String s= "raceacar";
        String y= "car";
        ind(s,y);

    }
}
