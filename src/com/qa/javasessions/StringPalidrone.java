package com.qa.javasessions;

import java.util.Scanner;

/*
 * Program to Check String is Palindrome or not
 */
public class StringPalidrone {

	public static void main(String[] args) {

		System.out.println("Please enter a string:");
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		String s = "madam";

		// System.out.println(s.length());

		String reverse = "";

		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		if (string.equals(reverse)) {
			System.out.println("string is palidrone");
		} else {
			System.out.println("string is not a palidrone");
		}

	}

}
