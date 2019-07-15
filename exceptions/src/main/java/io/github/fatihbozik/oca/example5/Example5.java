package io.github.fatihbozik.oca.example5;

public class Example5 {

    public static void main(String[] args) throws Exception {

	String a = null;
	try {
	    throw new RuntimeException();
	} catch (Exception e) {
	    throw new RuntimeException();
	} finally {
	    throw new Exception();
	}
    }
}
