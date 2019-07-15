package io.github.fatihbozik.oca.polymorphism.example3;

public class Capybara extends Rodent {

    public static void main(String[] args) {
	Rodent rodent = new Rodent();
	Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime
    }
}
