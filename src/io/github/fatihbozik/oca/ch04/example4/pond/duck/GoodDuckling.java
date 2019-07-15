package io.github.fatihbozik.oca.ch04.example4.pond.duck;

public class GoodDuckling {

    public void makeNoise() {
	MotherDuck dock = new MotherDuck();
	dock.quack();
	System.out.println(dock.noise);
    }
}
