package io.github.fatihbozik.oca.example6.pond.shore;

public class BirdWatcher {

    public void watchBird() {
	Bird bird = new Bird();
	bird.floatInWater();
	System.out.println(bird.text);
    }
}
