package io.github.fatihbozik.oca.ch04.example18;

/**
 * @author fatihbozik
 */
public class A {
    private int a;
    private static final int finalA;

    static {
	finalA = 20;
    }

    public static void main(String[] args) {
	A a = new A();
    }


}
