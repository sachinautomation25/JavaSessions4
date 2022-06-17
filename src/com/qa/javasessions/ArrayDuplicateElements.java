package com.qa.javasessions;

/*
 * Find Duplicate Elements in an Array-Brute force method
 */
public class ArrayDuplicateElements {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 3, 2, 4, 4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					System.out.println(arr[i]);
				}
			}
		}

	}

}
