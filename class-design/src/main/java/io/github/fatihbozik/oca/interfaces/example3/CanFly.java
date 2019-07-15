package io.github.fatihbozik.oca.interfaces.example3;

public interface CanFly {
    void fly(int speed);

    abstract void takeoff();

    public abstract double dive();
}

// Compiler converts this ->
//
//public abstract interface CanFly {
//    public abstract void fly(int speed);
//
//    public abstract void takeoff();
//
//    public abstract double dive();
//}


