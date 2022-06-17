package com.qa.javasessions;
/*
 * Program to Reverse a Number
 */
public class ReverseANumber {

	public static void main(String[] args) {

		int n = 6554;
		int temp = n;

		int rev = 0;
		int rem = 0;

		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		System.out.println("reverse of number " + temp + " is:" + rev);

	}

}
