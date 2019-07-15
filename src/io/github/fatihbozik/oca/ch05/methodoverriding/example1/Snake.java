package io.github.fatihbozik.oca.ch05.methodoverriding.example1;

public class Snake extends Reptile {

    protected boolean hasLegs() {
	return false;
    }

    protected double getWeight() throws InsufficientDataException {
	return 5D;
    }
}
