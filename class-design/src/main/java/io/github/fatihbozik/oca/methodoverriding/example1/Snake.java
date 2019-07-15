package io.github.fatihbozik.oca.methodoverriding.example1;

public class Snake extends Reptile {

    protected boolean hasLegs() {
	return false;
    }

    protected double getWeight() throws InsufficientDataException {
	return 5D;
    }
}
