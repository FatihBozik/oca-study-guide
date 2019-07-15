package io.github.fatihbozik.oca.formattingdateandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Example2 {

    public static void main(String[] args) {
	LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
	LocalTime time = LocalTime.of(11, 12, 34);
	LocalDateTime dateTime = LocalDateTime.of(date, time);

	System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2020-01-20
	System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 11:12:34
	System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2020-01-20T11:12:34
    }
}
