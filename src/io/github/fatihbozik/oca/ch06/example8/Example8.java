package io.github.fatihbozik.oca.ch06.example8;

public class Example8 {

    public static double learnException(int a, int b) {
	try {
	    return a / b;
	} catch (ArithmeticException e) {
	    return 0D;
	} catch (RuntimeException e) {
	    return -1D;
	} finally {
	    System.out.println("done");
	}
    }

    public static void doubleDivisionByZero() {
	System.out.println("1.0 / 0.0 : " + (1.0 / 0.0));
	System.out.println("-1.0 / 0.0 : " + (-1.0 / 0.0));
	System.out.println("0.0 / 0.0 : " + (0.0 / 0.0));
    }

    public static void main(String[] args) {
	doubleDivisionByZero();
	System.out.println(learnException(0, 0));
    }


}

class CapsizedException extends Exception {
}

class Transport {
    public int travel() throws CapsizedException {
	return 2;
    }
}

//class Boat {
//    public int travel() throws Exception {
//	return 4;
//    }
//
//    ; // j1
//
//    public static void main(String... distance) throws Exception {
//	try {
//	    System.out.print(new Boat().travel());
//	} catch (Exception e) {
//	    System.out.print(8);
//	}
//    }
//}

//class Attendance {
//    private Boolean[] list = (Boolean[]) new Object();  // value omitted
//    public int printTodaysCount() {
//	int count=0;
//	for(int i=0; i<10; i++) {
//	    if(list[i]) ++count;
//	}
//	return count;
//    }
//    public static void main(String[] roster) {
//	new Attendance().printTodaysCount();
//    }
//}

class A {

}

class B extends A {

}

class Coat {
    public Long zipper() throws Exception {
	try {

	    Number a = 5F;
	    Integer a1 = (Integer) a;


//	    Object a = new Object();
//	    String checkZipper = (String)a;
	} catch (Exception e) {
	    throw new RuntimeException("Broken!");
	}
	return null;
    }
    public static void main(String... warmth) {
	try {
	    new Coat().zipper();
	    System.out.print("Finished!");
	} catch (Throwable t) {}
    }
}


