package io.github.fatihbozik.oca.ch03.workingWithDatesAndTimes;

import sun.util.resources.cldr.dav.LocaleNames_dav;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExamples {

    public static void main(String[] args) {
	// Creating an object with the current date
	Date date = new Date(); // OLD WAY
	LocalDate localDate = LocalDate.now(); // NEW WAY

	// Creating an object with current date and time
	Date date2 = new Date(); // OLD WAY
	LocalDateTime localDateTime = LocalDateTime.now(); // NEW WAY

	// Creating object representing January 1, 2015
	Calendar c = Calendar.getInstance();
	c.set(2015, Calendar.JANUARY, 1);
	Date jan = c.getTime();

	c = new GregorianCalendar(2015, Calendar.JANUARY, 1);
	Date jan2 = c.getTime();

	LocalDate jan3 = LocalDate.of(2015, Month.JANUARY, 1);

	// Creating object representing January 1, 2015 without constant
	Calendar c2 = Calendar.getInstance();
	c.set(2015, 0, 1);
	Date jan4 = c.getTime();

	LocalDate jan5 = LocalDate.of(2015, 1, 1);
    }
}
