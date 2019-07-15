package io.github.fatihbozik.oca.example15;

import io.github.fatihbozik.oca.ch04.example14.Animal;
import io.github.fatihbozik.oca.ch04.example14.CheckTrait;

import java.util.ArrayList;
import java.util.List;

public class UsingAnonymousClass {

    public static void main(String[] args) {
	List<Animal> animals = new ArrayList<>();
	animals.add(new Animal("Fish", false, true));
	animals.add(new Animal("Kangaroo", true, false));
	animals.add(new Animal("Rabbit", true, false));
	animals.add(new Animal("Turtle", false, true));

	print(animals, new CheckTrait() {
	    @Override
	    public boolean test(Animal a) {
		return a.canHop();
	    }
	});
    }


    public static void print(List<Animal> animals, CheckTrait checkTrait) {
	for (Animal a : animals) {
	    if (checkTrait.test(a)) {
		System.out.print(a + " ");
	    }
	}

	System.out.println();
    }
}
