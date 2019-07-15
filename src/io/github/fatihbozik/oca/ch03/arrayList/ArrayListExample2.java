package io.github.fatihbozik.oca.ch03.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("hawk"); // [hawk]
	list.add(Boolean.TRUE); // [hawk, true]

	ArrayList<String> safer = new ArrayList<>();
	safer.add("sparrow"); // [sparrow]
//	safer.add(Boolean.TRUE); // DOES NOT COMPILE

	// void add(int index, E element)
	List<String> birds = new ArrayList();
	birds.add("hawk"); // [hawk]
	birds.add(1, "robin"); // [hawk, robin]
	birds.add(0, "blue jay"); // [blue jay, hawk, robin]
	birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]

	// boolean remove(Object object)
	birds.remove("eagle"); // false
	birds.remove("cardinal"); // true

	// E remove(int index)
	birds.remove(0); // prints hawk

//	birds.remove(100); // throws IndexOutOfBoundsException

	birds = new ArrayList<>();
	birds.add("hawk"); // [hawk]
	System.out.println(birds.size()); // 1

	birds.set(0, "robin"); // [robin]
	System.out.println(birds.size()); // 1

	birds.set(1, "robin"); // throws IndexOutOfBoundsException

	birds.clear();

    }
}
