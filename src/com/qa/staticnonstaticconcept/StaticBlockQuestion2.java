package com.qa.staticnonstaticconcept;

public class StaticBlockQuestion2 {

	static {
		System.out.println("static block");
	}

	public static void test() {
		System.out.println("test method");
	}

	public static void main(String[] args) {

		System.out.println("main method");
		test();
	}

}
