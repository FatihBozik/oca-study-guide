package io.github.fatihbozik.oca.example16;


import java.util.ArrayList;
import java.util.List;


public class FunctionalProgramming {

    public static void main(String[] args) {
	List<Animal> animals = new ArrayList<>();
	animals.add(new Animal("Fish", false, true));
	animals.add(new Animal("Kangaroo", true, false));
	animals.add(new Animal("Rabbit", true, false));
	animals.add(new Animal("Turtle", false, true));

//	// Functional Way
//	print(animals, (Animal a) -> {
//	    return a.canHop();
//	});
//	print(animals, a -> a.canHop());
	print(animals, Animal::canHop);

	int[] taxis = {1, 3};
	for (Object obj : taxis) {
	    System.out.println(obj);
	}


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
