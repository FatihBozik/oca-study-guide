package io.github.fatihbozik.oca.ch05.polymorphism.questions.question1;

public class Platypus extends Mammal { // DOES NOT COMPILE

    public Platypus() {
	super(5);
	System.out.println("Platypus");
    }


    public static void main(String[] args) {
	new Mammal(5);
    }
}
