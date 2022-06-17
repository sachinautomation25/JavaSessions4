package com.qa.exceptionhandling;

public class TryCatchBlock2 {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("bye");
		} finally {
			System.out.println("finally");
		}

		System.out.println("--------------------");
		try {
			int a[] = new int[2];
			a[2] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("message: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("message: " + e.getMessage());
		}
		System.out.println("--------------------");

		// we can have try block without catch but we have to add finally block then
		try {
			int i = 9 / 0;
		} // Syntax error, insert "Finally" to complete TryStatement
//		catch (Exception e) {
//			
//		}
		finally {
			System.out.println("finally");
		}
		System.out.println("disconnect"); // not printing disconnect because exception occured at line no 30 but we are
											// not catching or handling so program
		// terminate immeditaley but finally block execeuted whether exception occured
		// or not

		// where will you use finally in your program,use case or in real time: the
		// actual use of finally whenever we are making connection to our database
		// connected to db and after that some exception occured, in catch block you
		// have handled it but in finally you will close the connection
	}
}
