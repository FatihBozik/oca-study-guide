package io.github.fatihbozik.oca.ch05.polymorphism.example4;

public class Bird {
    public String getName() {
	return "Unknown";
    }

    public void displayInformation() {
	System.out.println("The bird name is: " + getName());
    }
}
