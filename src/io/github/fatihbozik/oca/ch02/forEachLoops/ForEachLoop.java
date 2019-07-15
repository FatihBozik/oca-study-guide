package io.github.fatihbozik.oca.ch02.forEachLoops;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {

	// For Built in Java Arrays
	String[] names = {"fatih", "bozik"};
	for (String name : names) {
	    System.out.println(name + ", ");
	}
	for (int i = 0; i < names.length; i++) {
	    String name = names[i];
	    System.out.println(name + ", ");
	}

	// For Iterable Collections
	List<Integer> values = Arrays.asList(1, 2, 3);
	for (int value : values) {
	    System.out.println(value + ", ");
	}
	for (Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
	    int value = i.next();
	    System.out.println(value + ", ");
	}

	System.out.println("fat".indexOf(""));
    }
}
