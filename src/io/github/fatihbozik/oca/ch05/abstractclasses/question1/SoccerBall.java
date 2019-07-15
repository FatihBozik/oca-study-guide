package io.github.fatihbozik.oca.ch05.abstractclasses.question1;

public class SoccerBall extends Ball implements Equipment {
    public SoccerBall() {
	super(5);
    }

    public Ball get() {
	return this;
    }

    public static void main(String[] passes) {
	Equipment equipment = (Equipment) (Ball) new SoccerBall().get();
	System.out.print(((SoccerBall) equipment).size);
    }
}

