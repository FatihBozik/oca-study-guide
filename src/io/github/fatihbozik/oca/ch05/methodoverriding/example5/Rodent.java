package io.github.fatihbozik.oca.ch05.methodoverriding.example5;

public class Rodent {
    protected int tailLength = 4;

    public void getRodentDetails() {
	System.out.println("[parentTail=" + tailLength + "]");
    }
}
