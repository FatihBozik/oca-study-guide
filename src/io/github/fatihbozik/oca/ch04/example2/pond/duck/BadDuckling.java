package io.github.fatihbozik.oca.ch04.example2.pond.duck;

public class BadDuckling {

    public static void main(String[] args) {
	BadDuckling b = new BadDuckling();
	b.makeNoise();
    }

    private void makeNoise() {
	FatherDuck duck = new FatherDuck();
//	duck.quack(); // DOES NOT COMPILE
//	System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
