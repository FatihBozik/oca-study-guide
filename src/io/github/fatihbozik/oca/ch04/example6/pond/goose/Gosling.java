package io.github.fatihbozik.oca.ch04.example6.pond.goose;

import io.github.fatihbozik.oca.ch04.example6.pond.shore.Bird;

public class Gosling extends Bird {

    public static void main(String[] args) {
	new Gosling().swim();
    }

    public void swim() {
	floatInWater();
	System.out.println(text);
    }
}
