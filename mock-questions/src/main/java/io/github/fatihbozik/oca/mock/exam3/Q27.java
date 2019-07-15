package io.github.fatihbozik.oca.mock.exam3;


class SuperUncheckedException extends RuntimeException {
}

class SubUncheckedException extends SuperUncheckedException {
}

public class Q27 {
    void overrideMe() throws SubUncheckedException {

    }
}

class Q28 extends Q27 {
    void overrideMe() throws SuperUncheckedException {

    }
}
