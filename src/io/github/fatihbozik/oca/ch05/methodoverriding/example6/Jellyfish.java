package io.github.fatihbozik.oca.ch05.methodoverriding.example6;

public class Jellyfish extends Animal {
    public int length = 5;

    public static void main(String[] args) {
	Jellyfish jellyfish = new Jellyfish();
	System.out.println(jellyfish.length); // 5

	Animal animal = new Jellyfish();
	System.out.println(animal.length); // 2
    }
}
