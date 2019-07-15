package io.github.fatihbozik.oca.ch05.polymorphism.questions.question10;

public abstract class Bird {
    private void fly() {
	System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
	Bird bird = new Pelican();
	bird.fly(); // Bird is flying
    }
}
