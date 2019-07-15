package io.github.fatihbozik.oca.example14;

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
	return a.canHop();
    }
}