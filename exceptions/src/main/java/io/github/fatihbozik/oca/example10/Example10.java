package io.github.fatihbozik.oca.example10;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Example10 {
    public static void main(String[] args) {
	Period wrong = Period.ofYears(1).ofWeeks(1);
	System.out.println(wrong);


	LocalDate localDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
