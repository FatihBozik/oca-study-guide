package io.github.fatihbozik.oca.ch05.abstractclasses.question3;

abstract class House {
    protected abstract Object getSpace();
}

abstract class Room extends House {
    abstract Object getSpace(Object list);
}

abstract public class Ballroom extends House {
    public abstract Object getSpace();

    public static void main(String[] squareFootage) {
	System.out.print("Let's start the party!");
    }
}
