package io.github.fatihbozik.oca.mock.exam1;

public class Question1 {

    public static void main(String... books) {
	StringBuilder sb = new StringBuilder();
	for(String book : books)
	    sb.insert(sb.indexOf("c"), book);
	System.out.println(sb);
    }
}
