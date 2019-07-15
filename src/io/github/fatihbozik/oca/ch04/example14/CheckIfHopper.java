package io.github.fatihbozik.oca.ch04.example14;

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
	return a.canHop();
    }
}