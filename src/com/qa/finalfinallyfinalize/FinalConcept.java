package com.qa.finalfinallyfinalize;

/*
 * final keyword is used to define the constant values
 * final can be used to mark a variable "unchangeable".
 * 
 * final keyword also used to prevent the inheritance
 * final can also make a class not "inheritable". i.e. the class can not be subclassed.
 * 
 * final can also make a method not "overrideable"
 * final keyword is used to prevent method overriding
 */
public class FinalConcept {

	public static void main(String[] args) {

		final int a = 10;// what if you restrict no one can change the variable value-simple define
							// variable with final keyword
		// constant values-the value which we cannot change
		// constant values-which we cannot modify
		// a = 20;//The final local variable a cannot be assigned. It must be blank and
		// not using a compound assignment
		// a = 30;
		System.out.println(a);

	}

}
