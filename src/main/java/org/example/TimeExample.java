package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeExample {
    public static void main(String[] args) {
        String dateStr = "2025-05-22"; // or LocalDate.now().toString()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed date: " + parsedDate);
    }
}