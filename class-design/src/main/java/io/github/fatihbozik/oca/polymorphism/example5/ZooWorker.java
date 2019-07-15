package io.github.fatihbozik.oca.polymorphism.example5;

public class ZooWorker {

    public static void feed(Reptile reptile) {
	System.out.println("Feeding reptile " + reptile.getName());
    }

    public static void main(String[] args) {
	feed(new Reptile()); //Feeding reptile Reptile
	feed(new Alligator()); // Feeding reptile Alligator
	feed(new Crocodile()); // Feeding reptile Crocodile
    }
}
