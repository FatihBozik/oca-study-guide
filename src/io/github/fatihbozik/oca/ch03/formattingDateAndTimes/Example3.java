package io.github.fatihbozik.oca.ch03.formattingDateAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Example3 {

    public static void main(String[] args) {
	LocalDate date = LocalDate.of(2023, Month.JANUARY, 20);
	LocalTime time = LocalTime.of(11, 12, 34);
	LocalDateTime dateTime = LocalDateTime.of(date, time);

	DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	System.out.println(shortDate.format(dateTime)); // 1/20/23
	System.out.println(shortDate.format(date)); // 1/20/23
	System.out.println(shortDate.format(time)); // UnsupportedTemporalTypeException: Unsupported field: MonthOfYear

	DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	System.out.println(shortDateTime.format(dateTime)); // 1/20/23 11:12 AM
	System.out.println(shortDateTime.format(date)); // UnsupportedTemporalTypeException: Unsupported field: ClockHourOfAmPm
	System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException: Unsupported field: MonthOfYear

	DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	System.out.println(shortTime.format(time)); // 11:12 AM
	System.out.println(shortTime.format(date)); // Unsupported field: ClockHourOfAmPm
	System.out.println(shortTime.format(dateTime)); // 11:12 AM
    }
}