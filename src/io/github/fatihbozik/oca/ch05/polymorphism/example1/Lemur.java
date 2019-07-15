package io.github.fatihbozik.oca.ch05.polymorphism.example1;

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
	return false;
    }

    public int age = 10;

    public static void main(String[] args) {
	Lemur lemur = new Lemur();
	System.out.println(lemur.age); // 10

	HasTail hasTail = lemur;
	System.out.println(hasTail.isTailStriped()); // false
//	System.out.println(hasTail.age); // DOES NOT COMPILE

	Primate primate = lemur;
	System.out.println(primate.hasHair()); // true
//	System.out.println(primate.isTailStriped()); // DOES NOT COMPILE

//	Lemur lemur2 = primate; // DOES NOT COMPILE
//	Lemur lemur3 = (Lemur) primate; // DOES COMPILE
    }
}
