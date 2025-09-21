package com.java.corejava;

class Test1 {

	String str;

	public void add(int a) {
		System.out.println(a);

	}

	public void add(int a, int b) {

		System.out.println(a + b);

	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}
}

public class OverLoadingDemo {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		t1.add(10);
		System.out.println();
		t1.add(10, 20);
		System.out.println();

		t1.add(10, 20, 30);

	}

}
