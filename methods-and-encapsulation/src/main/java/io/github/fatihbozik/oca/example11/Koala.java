package io.github.fatihbozik.oca.example11;

public class Koala {
    public static int count = 0;

    public static void main(String[] args) {
	Koala.count = 4;

	Koala koala1 = new Koala();
	Koala koala2 = new Koala();

	koala1.count = 6;
	koala2.count = 5;
	System.out.println(Koala.count);
    }
}
