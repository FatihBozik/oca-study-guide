package io.github.fatihbozik.oca.ch04.example5.pond.duck;

public class MotherDuck {
    String noise = "quack";

    void quack() {
	System.out.println(noise);
    }

    private void makeNoise() {
	quack();
    }
}
