package com.qa.javasessions;

import java.util.Iterator;

/*
 * loops-repetitive task,iteration 
 */
public class LoopsConcept {

	public static void main(String[] args) {

		// print 1 to 10
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);// Unnecessary same repetitive code you have to write, worst way of writing the
								// program

		// 1. while loop
		// print 1 to 10
		int i = 1;// i is counter, initilization
		while (i <= 10) {// conditional part
			System.out.println(i);// logic
			i = i + 1;// incremental or decremental
		}
		System.out.println("---------------");
		// 2. for loop
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}
		System.out.println("------------");
		// print even numbers 1 to 10
		for (int even = 2; even <= 10; even = even + 2)
			System.out.println(even);

		System.out.println("------------");
		// print odd numbers 1 to 10
		for (int odd = 1; odd <= 10; odd = odd + 2)
			System.out.println(odd);
		System.out.println("------------");
		// modelus
		// 10%5=0, 3%2=1, 100%5=0
		for (int m = 1; m <= 100; m++) {
			if (m % 5 == 0) {
				System.out.println(m + " %5==0");
			}
		}
		System.out.println("------------");

		int a = 0 / 9;// 0 divided by any number is 0
		System.out.println(a);

		try {
			int n = 9 / 0;// Exception in thread "main" java.lang.ArithmeticException: / by zero
			// any number divided by 0 is infinity in mathematics but in java doesnt define
			// it , java will throw exception aithmatic exception number divide by zer
			System.out.println(n);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("---------");

		System.out.println(9 / 3);
		System.out.println(9 / 2);
		System.out.println(9 % 2);

		double d = 9 / 2;
		System.out.println(d);

		System.out.println("---------");
		// 3. do while loop-less popular,do while will execute atleast once
		int p = 1;
		do {
			System.out.println(p);
			p++;
		} while (p <= 10);

	}
}
