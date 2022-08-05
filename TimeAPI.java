package com.company;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate Tommorow = yesterday.plusDays(2);
        System.out.println("Today is "+date);
        System.out.println("Yesterday is "+yesterday);
        System.out.println("Tommorow is "+Tommorow);
    }
}
