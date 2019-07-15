package io.github.fatihbozik.oca.ch05.interfaces.example16;

public class Cat implements Walk, Run {

    public int getSpeed() {
	return 1;
    }

    public static void main(String[] args) {
	System.out.println(new Cat().getSpeed()); // Prints: 1
    }
}
