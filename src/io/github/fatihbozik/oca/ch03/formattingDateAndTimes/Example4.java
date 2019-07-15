package io.github.fatihbozik.oca.ch03.formattingDateAndTimes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Example4 {

    public static void main(String[] args) {
	LocalDate date = LocalDate.of(2023, Month.JANUARY, 20);
	LocalTime time = LocalTime.of(11, 12, 34);
	LocalDateTime dateTime = LocalDateTime.of(date, time);

	DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	System.out.println(shortF.format(dateTime)); // 1/20/23 11:12 AM

	DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	System.out.println(mediumF.format(dateTime)); // Jan 20, 2023 11:12:34 AM

	// The New Way -> Java 8 and later
	DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
	System.out.println(dateTime.format(f)); // January 20, 2023, 11:12
	System.out.println(f.format(dateTime)); // January 20, 2023, 11:12

	// The Old Way -> Java 7 and earlier
	SimpleDateFormat sf = new SimpleDateFormat("MMMM dd, yyyy, hh:mm");
	System.out.println(sf.format(new Date()));
    }
}
