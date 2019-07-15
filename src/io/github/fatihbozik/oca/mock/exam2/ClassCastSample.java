package io.github.fatihbozik.oca.mock.exam2;

class SuperClass {

}

interface Implementable {

}

class SubClass extends SuperClass implements Implementable {

}

class OtherClass {

}

public class ClassCastSample {
    public static void main(String[] args) {
	SuperClass superClass = new SuperClass();
	SubClass subClass = new SubClass();
	OtherClass otherClass = new OtherClass();

//	SubClass subClass = superClass;     				// DOES NOT COMPILE
	SubClass b = (SubClass) superClass; 				// Throws class cast exception

	Implementable implementable = subClass;

//	Implementable implementable = superClass; 		 	// DOES NOT COMPILE
	Implementable implementable2 = (Implementable) superClass;      // Throws class cast exception
	Implementable implementable3 = (Implementable) otherClass;      // Throws class cast exception

//	OtherClass otherClass = superClass; 		 		// DOES NOT COMPILE
//	OtherClass otherClass = (OtherClass) superClass; 		// DOES NOT COMPILE
    }
}
