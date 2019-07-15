package io.github.fatihbozik.oca.ch03.formattingDateAndTimes;

import java.time.LocalDate;
import java.time.Month;

public class Example1 {
    public static void main(String[] args) {
	LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
	System.out.println(date.getYear()); // 2020
	System.out.println(date.getMonth()); // JANUARY
	System.out.println(date.getDayOfMonth()); // 20
	System.out.println(date.getDayOfWeek()); // MONDAY
	System.out.println(date.getDayOfYear()); // 20
    }
}
