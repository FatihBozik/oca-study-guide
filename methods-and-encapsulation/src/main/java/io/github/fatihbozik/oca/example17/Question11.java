package io.github.fatihbozik.oca.example17;

public class Question11 {

    private int privateInstance1;
    private int privateInstance2;

    public static void main(String[] args) {
	Question11 question11 = new Question11();
	System.out.println(question11.privateInstance1);

	Question11 question12 = new Question11();
	System.out.println(question12.privateInstance2);
    }


}
