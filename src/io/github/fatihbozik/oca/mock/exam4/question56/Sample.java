package io.github.fatihbozik.oca.mock.exam4.question56;

class A{
    A() {  print();   }
    void print() { System.out.println("A"); }
}
class B extends A{
    int i =   4;
    public static void main(String[] args){
	A a = new B();
	a.print();

	Float f = Float.valueOf("1.0");
	System.out.println(f);
    }
    void print() { System.out.println(i); }

    int main;
}
