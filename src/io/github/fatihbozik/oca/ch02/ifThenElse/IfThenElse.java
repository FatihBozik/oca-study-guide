package io.github.fatihbozik.oca.ch02.ifThenElse;

public class IfThenElse {
    public static void main(String[] args) {
	int hourOfDay = 5;

	if (hourOfDay < 15) {
	    System.out.println("Good Afternoon");
	} else if (hourOfDay < 11) {
	    System.out.println("Good Morning"); // UNREACHABLE CODE But compiles and run without exception
	} else {
	    System.out.printf("Good evening");
	}
    }

}

