package io.github.fatihbozik.oca.interfaces.example11;

public interface CanSwim {
    int MAXIMUM_DEPTH = 100;

    final static boolean UNDERWATER = true;

    public static final String TYPE = "Submersible";
}


// Compiler converts to this ->
//
//public abstract interface CanSwim {
//    public static final int MAXIMUM_DEPTH = 100;
//
//    public static final boolean UNDERWATER = true;
//
//    public static final String TYPE = "Submersible";
//}
