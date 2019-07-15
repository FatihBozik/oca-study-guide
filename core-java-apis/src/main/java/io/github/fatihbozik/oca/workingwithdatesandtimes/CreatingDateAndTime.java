package io.github.fatihbozik.oca.ch03.workingWithDatesAndTimes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class CreatingDateAndTime {

    public static void main(String[] args) {
	System.out.println(LocalDate.now()); // 2019-04-10
	System.out.println(LocalTime.now()); // 22:52:22.051
	System.out.println(LocalDateTime.now()); // 2019-04-10T22:52:22.051

	// public static LocalDate of(int year, Month month, int dayOfMonth)
	// public static LocalDate of(int year, int month, int dayOfMonth)
	LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
	LocalDate date2 = LocalDate.of(2015, 1, 20);

	// public static LocalTime of(int hour, int minute)
	// public static LocalTime of(int hour, int minute, int second)
	// public static LocalTime of(int hour, int minute, int second, int nanos)
	LocalTime time1 = LocalTime.of(6, 15);
	LocalTime time2 = LocalTime.of(6, 15, 30);
	LocalTime time3 = LocalTime.of(6, 15, 30, 200);

	// public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
	// public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)

	// public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
	// public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)

	// public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
	// public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)
	LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);

	// public static LocalDateTime of(LocalDate date, LocalTime time)
	LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

//	LocalDate d = new LocalDate(); // DOES NOT COMPILE
	LocalDate d = LocalDate.of(2015, Month.JANUARY, 32); // throws java.time.DateTimeException
    }
}
