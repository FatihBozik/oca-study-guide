package io.github.fatihbozik.oca.ch05.methodoverriding.example4;

public class Marsupial {
    public boolean isBiped() {
	return false;
    }

    public void getMarsupialDescription() {
	System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}
