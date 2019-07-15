package io.github.fatihbozik.oca.mock.exam1;

public class Question2 {
    public static void main(String[] args) {
	int[] crossword[] = new int[10][20];

	for (int i = 0; i < crossword.length; i++)
	    for (int j = 0; j < crossword.length; j++)
		crossword[i][j] = 'x';

//	System.out.println(crossword.size()); // DOES NOT COMPILE
	System.out.println(crossword.length);
    }
}
