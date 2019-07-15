package io.github.fatihbozik.oca.example16;


class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
	return a.canHop();
    }
}