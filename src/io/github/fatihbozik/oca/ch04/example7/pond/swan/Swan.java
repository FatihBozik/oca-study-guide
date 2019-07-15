package io.github.fatihbozik.oca.ch04.example7.pond.swan;

import io.github.fatihbozik.oca.ch04.example7.pond.shore.Bird;

public class Swan extends Bird {

    // A member is used without referring to a variable. This is the case on lines 10 and 11.
    // In this case, we are taking advantage of inheritance and protected access is allowed
    public void swim() {
	floatInWater();                  // package access to superclass
	System.out.println(text);        // package access to superclass
    }

    // A member is used through a variable. This is the case on lines
    // 20, 21, 26, 27. In this case, the rules for the reference type
    // of the variable are what matter. If it is a subclass, protected
    // access is allowed. This works for references to the same class
    // or subclass.
    public void helpOtherSwanSwim() {
	Swan other = new Swan();
	other.floatInWater();            // package access to superclass
	System.out.println(other.text);  // package access to superclass
    }

    public void helpOtherBirdSwim() {
	Bird other = new Bird();
//	other.floatInWater();            // DOES NOT COMPILE
//	System.out.println(other.text);  // DOES NOT COMPILE
    }
}


