package io.github.fatihbozik.oca.ch03.formattingDateAndTimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) {
	DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");

	LocalDate date = LocalDate.parse("01 02 2015", f);
	System.out.println(date); // 2015-01-02

	LocalTime time = LocalTime.parse("11:22");
	System.out.println(time); // 11:22

	int[] a = {2, 6};
	int[] b = {2, 6};

	String[] asss = new String[4];

	System.out.println(Arrays.equals(a, b));


	// String overrides equals
	// StringBuilder does not override equals
	// List override equals
	// Array does not override equals -> use Arrays.equals

	// List override toString
	// Array does not override toString -> use Arrays.toString
    }
}
