package com.qa.javasessions;

import java.util.Scanner;

/*
 * Program to Reverse a String
 */
public class ReverseAString {

	public static void main(String[] args) {

		System.out.println("Please enter a string:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// String s = "abcd";
		String temp = s;

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse of string " + temp + " is:" + reverse);

	}

}
