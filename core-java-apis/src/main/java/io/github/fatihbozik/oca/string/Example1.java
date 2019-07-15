package io.github.fatihbozik.oca.string;

public class Example1 {

    public static void main(String[] args) {
	String string = "animals";
	System.out.println(string.substring(7)); // ""

	StringBuilder s = new StringBuilder("a");
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(1));
    }
}
