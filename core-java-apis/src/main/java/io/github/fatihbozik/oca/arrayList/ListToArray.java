package io.github.fatihbozik.oca.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("hawk");
	list.add("robin");

	Object[] objectArray = list.toArray();
	System.out.println(Arrays.toString(objectArray)); // [hawk, robin]

	String[] stringArray = list.toArray(new String[0]);
	System.out.println(Arrays.toString(stringArray)); // [hawk, robin]
    }
}
