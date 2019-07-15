package io.github.fatihbozik.oca.example3;

public class Example3 {

    static void visitMonkeys() {
//	try {
//	    seeAnimals();
//	} catch (ExhibitClosed e) {
//
//	} catch (ExhibitClosedForLunch e) { // DOES NOT COMPILE
//
//	}
    }

    private static void seeAnimals() {
	throw new ExhibitClosedForLunch();
    }

    public static void main(String[] args) {
	visitMonkeys();
    }
}
