package io.github.fatihbozik.oca.ch03.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {
	String[] array = {"hawk", "robin"}; // [hawk, robin]
	List<String> list = Arrays.asList(array); // returns fixed size list
	System.out.println(list.size()); // 2

	list.set(1, "test"); // [hawk, test]
	array[0] = "new"; // [new, test]

	System.out.println(list); // [new, test]
	System.out.println(Arrays.toString(array)); // [new, test]

	list.add("eagle"); // throws UnsupportedOperationException
	list.remove(1); // throws UnsupportedOperationException
    }
}
