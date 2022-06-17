package com.qa.javasessions;

import java.util.HashSet;
import java.util.Set;

/*
 * Find Duplicate Elements in an Array-set interface
 */
public class ArrayDuplicateElements2 {

	public static void main(String[] args) {
		
		int arr[]= {2,4,2,5,4};

		Set<Integer> set=new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (set.add(arr[i])==false) {
				System.out.println(i+"-->"+arr[i]);
			}
		}
		System.out.println(set);
	}

}
