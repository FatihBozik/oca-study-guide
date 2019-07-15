package io.github.fatihbozik.oca.mock.exam4;

import java.util.ArrayList;
import java.util.List;

//class Sample implements IInt {
//
//    public void func(Object a) {
//	System.out.println(a);
//
//    }
//
//    public static void main(String[] args) {
//        int b, c;
//	int a = b = c = 100;
//
//
//
//
////	System.out.println(IInt.theValue);
////	System.out.println(theValue);
////
////	if (args[0].equals("open")) {
////	    if (args[1].equals("someone")) {
////		System.out.println("Hello!");
////	    } else {
////		System.out.println("Go away " + args[1]);
////	    }
////	}
//
//
//
//
//
//    }
//}

class Sample{
    void probe(int... x) { System.out.println("In ..."); }  //1

//    void probe(Integer x) { System.out.println("In Integer"); } //2

    void probe(Object x) { System.out.println("In Object"); } //2

    void probe(Number x) { System.out.println("In Number"); } //2

    void probe(long x) { System.out.println("In long"); } //3

    void probe(Long x) { System.out.println("In LONG"); } //4

    public static void main(String[] args){
	Integer a = 4; new Sample().probe(a); //5
	int b = 4; new Sample().probe(b); //6
    }
}