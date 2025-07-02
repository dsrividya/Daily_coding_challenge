package org.example;


public class VowelRev {

    public static void rev(String s)
    {
        char[] c=s.toCharArray();
        int start=0, end=s.length()-1;
        while(start<=end) {
            if (!isvowel(c[start])) {
                start++;
            } else if (!isvowel(c[end])) {
                end--;
            } else {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;

            }
        }
        System.out.println(new String(c));


    }
    public static boolean isvowel(Character c)
    {
           if(c=='i'||c=='a'||c=='e'||c=='o'||c=='u')
           {
               return true;
           }
           else
           {
               return false;
           }
    }
    public static void main(String[] args) {
        String s="hello";
        rev(s);

    }
}
