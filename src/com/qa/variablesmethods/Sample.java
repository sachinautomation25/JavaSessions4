package com.qa.variablesmethods;

import java.util.Scanner;

/*
 * create a method-pass 2 strings--return a string which is concentation of the 2 strings pass
 * return string should have a space in between
 */
public class Sample {

	public static void main(String[] args) {
		Sample obj = new Sample();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pass first string");
		String s1 = scan.nextLine();
		System.out.println("Please pass second string");
		String s2 = scan.nextLine();
		String s = obj.concatTwoString(s1, s2);
		System.out.println(s);
		
		scan.close();
		
		
	}

	public String concatTwoString(String s1, String s2) {
		return s1 + " " + s2;
	}
}
