package com.qa.javasessions;

/*
 * > < == >= <= != :use when we compare int,double
 * when comparing string we have to use string method or api like equals() or equalsIgnoreCase()
 */
public class ConditionalStatement {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		if (true) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		if (a >= b) {// a is greater to b or a equals to b, either of them one condition should true
						// then only control will go inside. whenever comparing int or double we should
						// use > < == >= <= != operator but in case of string we have string
			// method or api like equals()
			System.out.println("hi");
		}
		if (b >= a) {
			System.out.println("bye");
		}

		if (a != b) 
			System.out.println("tata");

		if (!false)// ! will:opposite of false is true
			System.out.println("heyyy");

		String s = "Selenium";
		String s2 = "selenium";

		if (s.equals(s2)) {
			System.out.println("equals" + "case consideration");
		}
		if (s.equalsIgnoreCase(s2)) {
			System.out.println("equalsIgnoreCase" + " case not considered");
		}

		// if-else if
		// wap to find out maximum number
		int x = 100;
		int y = 200;
		int z = 300;

		if (x > y && x > z) {
			System.out.println("x is greatest number");
		} else if (y > z) {
			System.out.println("y is greatest number");
		} else {
			System.out.println("z is greatest number");
		}

		System.out.println("---------------");

		// if-elseif
		// if inside if
		String studentName = "Malini";
		int marks = 0;
		if (studentName.equalsIgnoreCase("Malini")) {
			marks = 95;
			System.out.println(studentName + " marks: " + marks);
			if (marks > 90) {
				System.out.println(studentName + " awarded scholorship");
			}
		} else if (studentName.equalsIgnoreCase("deepak")) {
			marks = 95;
			System.out.println(studentName + " marks: " + marks);
			if (marks > 90) {
				System.out.println(studentName + " awarded scholorship");
			}
		} else if (studentName.equalsIgnoreCase("naveen")) {
			marks = 80;
			System.out.println(studentName + " marks: " + marks);
			if (marks > 90) {
				System.out.println(studentName + " awarded scholorship");
			}
		} else {
			System.out.println(studentName + " not found");
		}
		System.out.println(marks);

	}
}
