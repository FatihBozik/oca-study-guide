package io.github.fatihbozik.oca.mock.exam2;

public class MyExam {

    void question() {
	try {
	    question();
	} catch (StackOverflowError e) {
	    System.out.println("Caught");
	}
    }

    public static void main(String[] args) {
	new MyExam().question();
    }
}
