package io.github.fatihbozik.oca.example2;

public class Example2 {
    static void explore() {
	try {
	    fall();
	    System.out.println("Never get here");
	} catch (RuntimeException e) {
	    getUp();
	}
    }

    private static void fall() {
	throw new RuntimeException();
    }

    private static void getUp() {
	System.out.println("Get up");
    }

    public static void main(String[] args) {
	explore(); // Get up
    }
}
