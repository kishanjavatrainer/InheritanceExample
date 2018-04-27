package com.infotech.model;

public class B extends A {
	private int c = 20;

	public void displayFromB() {
		System.out.println("Value of field a " + a);
		// This line will give compiler error as b is not visible
		// System.out.println("Value of field b " + b);
		// Calling inherited method directly as if
		// it is a method of this class, as it is inherited from super class
		displayFromA();
		// ok, field of this class
		System.out.println("Value of field c " + c);
	}
}