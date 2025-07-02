package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsExample{
    public static void main(String[] args) {


        List<String> ll = Arrays.asList("Sri", "Vidya");
        ll.stream()
                .filter(s -> s.startsWith("S"))
                .forEach(System.out::println); // prints matching elements directly


    }
}

