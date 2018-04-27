package com.infotech.client;

import com.infotech.model.B;

public class ClientTest {

	public static void main(String[] args) {
		B b = new B();
		// calling the method of class B using class B object
		b.displayFromB();
		// calling the method of class A using class B object
		b.displayFromA();
	}
}
