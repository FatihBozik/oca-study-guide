package io.github.fatihbozik.oca.ch01.question2;

public class Tolls {
    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args) {
	Tolls tolls = new Tolls();
	int today = 20, tomorrow = 40;

	System.out.print(today + tolls.tomorrow + tolls.yesterday); // 31
    }
}
