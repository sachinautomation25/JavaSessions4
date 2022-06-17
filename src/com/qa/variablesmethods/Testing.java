package com.qa.variablesmethods;

/*
 * create a method and return the object of the class
 */
public class Testing {

	public static void main(String[] args) {

		Testing test = new Testing();
		Testing test2 = test.returnObject();
		System.out.println("main"+test2.hashCode());

	}

	public Testing returnObject() {
		Testing obj = new Testing();
		System.out.println("returnObject"+obj.hashCode());
		return obj;
	}
}
