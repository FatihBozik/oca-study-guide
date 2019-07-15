package io.github.fatihbozik.oca.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(99, 5, 81);
	Collections.sort(numbers);
	System.out.println(numbers); // prints [5, 81, 99]
    }
}
