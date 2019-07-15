package io.github.fatihbozik.oca.ch03.arrays;


import java.util.Arrays;

public class ArrayStoreException {

    public static void main(String[] args) {
	String[] strings = null;
	Object[] objects = strings;
//	String[]" againStrings = (String[]) objects;
//	againStrings[0] = new StringBuilder(); // DOES NOT COMPILE

//	objects[0] = new StringBuilder("5sacsc");


	String[] a = {"10", "990", "100"};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
    }
}
