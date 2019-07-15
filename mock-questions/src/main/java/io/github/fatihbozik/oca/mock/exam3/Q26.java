package io.github.fatihbozik.oca.mock.exam3;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Q26 {

    public static void main(String[] args) {
//	short s = 1;
//	byte b = s; 	// =>this will also not compile because although value is small enough to be held by a byte but
//			// the Right Hand Side i.e.s is a variable and not a constant.

	final short s = 1;
	byte b = s; // =>This is fine because s is a constant and the value fits into a byte.

//	final short s = 200;
//	byte b = s; // =>This is invalid because although s is a constant
//	but the value does not fit into a byte.

	// Implicit narrowing occurs only for byte, char, short, and int.
	// Remember that it does not occur for long, float, or double.
	// So, this will not compile: int i = 129L;


	float f = 1234567890F;
	System.out.println(f);
    }
}
