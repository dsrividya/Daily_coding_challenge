package org.example;

public class Lastlength {


    public static void leng(String s)
    {

        int count=0;
        String y= s.trim();
        for(int i=y.length()-1; i>=0;i--)
        {
            if(y.charAt(i)!=' ')
            {
                count++;
            }
            else {
               break;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String s="fly around";
        leng(s);
    }
}
