package io.github.fatihbozik.oca.ch03.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    public static void main(String[] args) {
	List<Integer> heights = new ArrayList<>();
	heights.add(null);

	int h = heights.get(0); // throws NullPointerException
    }

}
