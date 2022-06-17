package com.qa.arrayconcept;

public class Array2 {

	public static void main(String[] args) {

		int arr[] = new int[5];// integer array

		System.out.println(arr.length);
		System.out.println(arr[0]);

		String arr2[] = new String[2];// string type of array

		int arr3[] = new int[] { 1, 2, 3 };

		int arr4[] = { 1, 2, 3 };

		String cars[] = { "maruti", "tata", "ford" };

		System.out.println(cars.length);

		System.out.println(cars[0]);
		// System.out.println(cars[3]);// java.lang.ArrayIndexOutOfBoundsException: 3

		String s[] = null;
		// System.out.println(s.length);//java.lang.NullPointerException

		// System.out.println(s[0]);//java.lang.NullPointerException
		
		System.out.println(arr2[0]+"\n"+arr2[1]);
		
		char c[]= {'a','b'};
		
		boolean b[]=new boolean[2];
		for(boolean v:b)
		{
			System.out.println(v);
		}
		
		double d[]= {1,2};
		System.out.println(d[0]+"\n"+d[1]);

	}
}
