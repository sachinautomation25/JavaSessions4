package com.qa.finalfinallyfinalize;

/*
 * finally: is a Block
finally is used in a try/catch statement to execute code "always".
finally block will executed always whether exception occur or not
 */
public class FinallyConcept {

	public static void main(String[] args) {

		new FinallyConcept().test1();
		
		new FinallyConcept().test2();
		
		new FinallyConcept().divison();
	}

	public void test1() {
		try {
			System.out.println("inside test1 method");
			throw new Exception("SomeRuntimeException");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("inside finally block");
		}

	}

	public void test2() {
		try {
			System.out.println("inside test2");
		} finally {
			System.out.println("finally code in test2 method");
		}
	}
	
	public void divison() {
		System.out.println("---------------");
		try {
		int n=9/0;
		}
		catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("finally");
			System.out.println("DB connectivity--connection closed method");
		}
		System.out.println("bye");
	}

}
