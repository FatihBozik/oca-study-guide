package io.github.fatihbozik.oca.example10;

public class Koala {
    public int count = 0;

    public static void main(String[] args) {
	Koala k = new Koala();
	System.out.println(k.count);

	k = null;
	System.out.println(k.count);
    }
}
