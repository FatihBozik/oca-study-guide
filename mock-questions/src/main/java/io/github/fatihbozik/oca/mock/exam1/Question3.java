package io.github.fatihbozik.oca.mock.exam1;

public class Question3 {

    public static void main(String[] time) {
	final long winter = 10;
	final byte season = 2;

	final int fall = 4;
	final short summer = 3;
	switch (season) {
	    case 1:
	    case summer:
		System.out.println("summer");
	    case fall:
		System.out.println("fall");
//	    case winter:
		System.out.println("winter");
	    default:
	}
    }
}
