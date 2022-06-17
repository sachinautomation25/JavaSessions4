package com.qa.arrayconcept;

public class Two2DArray {

	public static void main(String[] args) {

		int ar[][] = new int[2][3];

		System.out.println(ar.length);
		System.out.println(ar[0].length + "\n" + ar[1].length);

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int) (Math.random() * 1000);
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println(ar[i][j]);
			}
		}
		int arr[][] = new int[2][];
		arr[0] = new int[2];
		arr[1] = new int[3];

		System.out.println("-------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 1000);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
