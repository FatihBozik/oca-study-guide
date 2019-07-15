package io.github.fatihbozik.oca.mock.exam4;

//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class TestClass {
//    public static void main(String[] args) throws Exception {
//	try {
//	    amethod();
//	    System.out.println("try ");
//	} catch (Exception e) {
//	    System.out.print("catch ");
//	} finally {
//	    System.out.print("finally ");
//	}
//	System.out.print("out ");
//    }
//
//    public static void amethod() {
//	LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");//2
//	String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME); //3
//	System.out.println(greatDayStr);//4
//
//    }
//
//    public void switchTest(byte x) {
//	switch (x) {
//	    case 'b':   // 1
//	    default:   // 2
//	    case -2:    // 3
//	    case 80:    // 4
//	}
//    }
//}

interface House{
    public default String getAddress(){
	return "101 Main Str";
    }
}

interface Bungalow extends House{
    public default String getAddress(){
	return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House{

}

public class TestClass {

    public static void main(String[] args) {
	House ci = new MyHouse();  //1
	System.out.println(ci.getAddress()); //2
    }
}
