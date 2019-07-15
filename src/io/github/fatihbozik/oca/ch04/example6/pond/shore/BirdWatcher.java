package io.github.fatihbozik.oca.ch04.example6.pond.shore;

public class BirdWatcher {

    public void watchBird() {
	Bird bird = new Bird();
	bird.floatInWater();
	System.out.println(bird.text);
    }
}
