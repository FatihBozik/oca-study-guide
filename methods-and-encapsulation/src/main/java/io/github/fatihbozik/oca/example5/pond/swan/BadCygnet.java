package io.github.fatihbozik.oca.example5.pond.swan;

import io.github.fatihbozik.oca.ch04.example5.pond.duck.MotherDuck;

public class BadCygnet {

    public void makeNoise() {
	MotherDuck duck = new MotherDuck();
//	duck.quack(); // DOES NOT COMPILE
//	System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
