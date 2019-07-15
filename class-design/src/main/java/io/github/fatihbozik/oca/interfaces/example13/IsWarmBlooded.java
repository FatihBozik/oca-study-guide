package io.github.fatihbozik.oca.interfaces.example13;

public interface IsWarmBlooded {
    boolean hasScales();

    public default double getTemperature() {
        return 10.0;
    }
}
