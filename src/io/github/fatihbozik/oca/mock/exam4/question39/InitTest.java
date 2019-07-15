package io.github.fatihbozik.oca.mock.exam4.question39;

import java.util.ArrayList;

public class InitTest {
    static String s1 = sM1("a");

    {
	s1 = sM1("b");
    }

    static {
	s1 = sM1("c");
    }

    public static void main(String args[]) {
	InitTest it = new InitTest();

    }

    private static void asx(int a, boolean check) {
	for(int i=0; i<3; System.out.println(++i));
    }

    private static String sM1(String s) {
	System.out.println(s1);
	return s;
    }
}