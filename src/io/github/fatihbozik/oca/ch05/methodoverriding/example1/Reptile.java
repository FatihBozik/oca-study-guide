package io.github.fatihbozik.oca.ch05.methodoverriding.example1;

public class Reptile {

    protected boolean hasLegs() throws InsufficientDataException {
	throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {
	return 2;
    }
}
