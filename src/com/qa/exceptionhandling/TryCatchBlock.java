package com.qa.exceptionhandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("B");

		try {
			int i = 9 / 0;// java.lang.ArithmeticException: / by zero whenever exception occured program
							// terminate immediately
		} catch (NullPointerException e) {
			System.out.println("some exception got occured");
			e.printStackTrace();
			System.out.println("message: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("some exception got occured");
			e.printStackTrace();
			System.out.println("message: " + e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("C");
	}
}
