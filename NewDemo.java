package com.array.exercise;

public class NewDemo {

	int x = 20;

	public static void main(String[] args) {

		NewDemo a = new NewDemo();

		System.out.println(a.x);
		a.x = 50;
		System.out.println("Update value + " + a.x);

		// System.out.println(a.y);

		System.out.println("--------------Implicite Procation------------------");
		int i = 20;
		long b = i;
		System.out.println("value of b is + " + b);

		System.out.println("--------------Explicit Procation------------------");
		long n = 403637482992l;
		int c = (int) n;
		System.out.println("value of c is + " + c);

		System.out.println("--------------Autoboxing------------------");
		int q = 10;
		Integer d = q;
		System.out.println("value of d is + " + d);

		System.out.println("--------------AutoUnboxing------------------");
		Integer f = 1233;
		int h = f;
		System.out.println("value of h is + " + h);

	}

}
