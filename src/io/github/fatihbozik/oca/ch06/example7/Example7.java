package io.github.fatihbozik.oca.ch06.example7;

public class Example7 {

    public static void main(String[] args) {

	String aString = null;
	try {
	    Integer anInt = Integer.parseInt("abv");
	} catch (NumberFormatException e) {
	    aString.length();
	} catch (NullPointerException e) {
	    System.out.println("Catch");
	}
    }
}
