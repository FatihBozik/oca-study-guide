package io.github.fatihbozik.oca.ch04.example14;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
	List<Animal> animals = new ArrayList<>(); // list of animals
	animals.add(new Animal("Fish", false, true));
	animals.add(new Animal("Kangaroo", true, false));
	animals.add(new Animal("Rabbit", true, false));
	animals.add(new Animal("Turtle", false, true));

	print(animals, new CheckIfHopper()); // pass class that does check
    }

    public static void print(List<Animal> animals, CheckTrait checkTrait) {
	for (Animal a : animals) {
	    if (checkTrait.test(a)) { // the general check
		System.out.print(a + " ");
	    }
	}

	System.out.println();
    }
}
