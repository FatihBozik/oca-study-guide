package io.github.fatihbozik.oca.interfaces.example8;

public class Bear implements Herbivore, Omnivore {
    public void eatPlants() {
	System.out.println("Eating plants");
    }

    public void eatMeat() {
	System.out.println("Eating meats");
    }
}
