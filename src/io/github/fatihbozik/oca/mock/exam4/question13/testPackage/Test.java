package io.github.fatihbozik.oca.mock.exam4.question13.testPackage;

import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
	String hello = "Hello";
	String lo = "lo";
	System.out.print((io.github.fatihbozik.oca.mock.exam4.question13.testPackage.Other.hello == hello) + " ");    //line 1
	System.out.print((io.github.fatihbozik.oca.mock.exam4.question13.other.Other.hello == hello) + " ");   //line 2
	System.out.print((hello == ("Hel" + "lo")) + " ");           //line 3
	System.out.print((hello == ("Hel" + lo)) + " ");              //line 4
	System.out.println(hello == ("Hel" + lo).intern());          //line 5

	String c = "a" + "b" + "c";
    }
}

class Other {
    static String hello = "Hello";
}