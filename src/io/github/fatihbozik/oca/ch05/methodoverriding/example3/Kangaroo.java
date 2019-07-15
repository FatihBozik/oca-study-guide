package io.github.fatihbozik.oca.ch05.methodoverriding.example3;

public class Kangaroo extends Marsupial {
    public static boolean isBiped() {
	return true;
    }

    public void getKangarooDescription() {
	System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
	Kangaroo joey = new Kangaroo();
	joey.getMarsupialDescription(); // Marsupial walks on two legs: false
	joey.getKangarooDescription(); // Kangaroo hops on two legs: true
    }
}
