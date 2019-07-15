package io.github.fatihbozik.oca.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing2 {

    public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>();
	numbers.add(1);
	numbers.add(2);

//	numbers.remove(1);
//	numbers.remove(new Integer(1));
	System.out.println(numbers);
    }
}
