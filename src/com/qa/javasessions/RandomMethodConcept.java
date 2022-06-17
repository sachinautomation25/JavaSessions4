package com.qa.javasessions;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * double java.lang.Math.random()
 * Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0. 
 */
public class RandomMethodConcept {

	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);
		System.out.println(d * 1000);
		System.out.println((int) (d * 1000));

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1000);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
