package com.qa.stringconcept;

import java.util.Arrays;

/*
 * Why password should be stored in char array char[] instead of string?
 */
public class PasswordStore {

	public static void main(String[] args) {

		String pwd = "naveen123";
		System.out.println("password: " + pwd);

		char c[] = new char[] { 'n', 'a', 'v', 'e', 'e', 'n' };
		System.out.println("password: " + c.toString());

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		Arrays.fill(c, '*');
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}
}
