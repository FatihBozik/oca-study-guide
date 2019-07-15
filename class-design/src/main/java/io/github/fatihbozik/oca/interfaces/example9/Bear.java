package io.github.fatihbozik.oca.interfaces.example9;

public class Bear implements Herbivore, Omnivore {
    public int eatPlants(int quantity) {
	System.out.println("Eating plants: " + quantity);
	return quantity;
    }

    public void eatPlants() {
	System.out.println("Eating plants");
    }
}
