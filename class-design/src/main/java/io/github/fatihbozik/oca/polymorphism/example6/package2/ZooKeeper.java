package io.github.fatihbozik.oca.polymorphism.example6.package2;

import io.github.fatihbozik.oca.polymorphism.example6.package1.Animal;
import io.github.fatihbozik.oca.polymorphism.example6.package1.Gorilla;

public class ZooKeeper {

    public static void main(String[] args) {
	Animal animal = new Gorilla();
	System.out.println(animal.getName());
    }
}
