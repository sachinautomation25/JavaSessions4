package com.qa.inheritance;

public class Bmw extends Car {

	@Override
	public void start() {// Cannot override the final method from Car
		System.out.println("Bmw--start");
	}

	public void sunRoof() {
		System.out.println("Bmm--sunRoof");
	}

	// @Override static method cannot be overidden
	public static void test() {
		System.out.println("Bmw--test");
	}
}
