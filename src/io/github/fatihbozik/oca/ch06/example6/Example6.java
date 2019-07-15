//package io.github.fatihbozik.oca.ch06.example6;
//
//public class Example6 {
//
//    public static void bad() {
//	try {
//	    eatCarrot();
//	} catch (NoMoreCarrotsException e) { // DOES NOT COMPILE
//	    System.out.println("Sad rabbit");
//	}
//    }
//
//    private static void eatCarrot() {
//    }
//
//    public static void good() throws NoMoreCarrotsException {
//	bad();
//    }
//
//    public static void main(String[] args) {
//	bad();
//    }
//}
