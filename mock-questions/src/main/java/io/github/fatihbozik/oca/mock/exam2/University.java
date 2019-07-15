package io.github.fatihbozik.oca.mock.exam2;

import java.util.Arrays;

class EJavaCourse {
    String courseName = "Java";

}

public class University {
    public static void main(String[] args) {
	EJavaCourse courses[] = {new EJavaCourse(), new EJavaCourse()};
	courses[0].courseName = "OCA";

//	for (EJavaCourse c : courses) {
//	    c.courseName = "OCP";
//	}
//
//	for (EJavaCourse c : courses) {
//	    System.out.println(c.courseName);
//	}

	for (EJavaCourse c : courses) {
	    c.courseName = "d";
	    c = new EJavaCourse();
	}

	for (EJavaCourse c : courses) {
	    System.out.println(c.courseName);
	}
//
//	int ints[] = {5, 6};
//	for (int c : ints) {
//	    c = c * 3;
//	}

//	System.out.println(Arrays.toString(ints));

    }

}
