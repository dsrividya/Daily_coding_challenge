package org.example;

import java.util.ArrayList;
import java.util.List;

public class LengthsubsrtringEx {

    public static void lengthsub(String s) {
        int left = 0;
        int right = 0;
        int max_length = 0;
        List<Character> ll = new ArrayList<>();
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!ll.contains(currentChar)) {
                ll.add(s.charAt(right));
                right++;
                max_length = Math.max(max_length, ll.size());

            } else {
                ll.remove(Character.valueOf(s.charAt(left)));
                left++;
            }
        }
            System.out.println(max_length);

    }
    public static void main(String[] args) {

        String s="abcdacb";
        lengthsub(s);
    }
}
