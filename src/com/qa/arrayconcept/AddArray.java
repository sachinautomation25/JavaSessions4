package com.qa.arrayconcept;

public class AddArray {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4, 5 };

//		int arr3[] = null;
//		arr3 = new int[arr1.length];
//
//		for (int i = 0; i < arr1.length; i++) {
//			// System.out.println(arr1[i] + arr2[i]);
//			arr3[i] = arr1[i] + arr2[i];
//		}
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.println(arr3[i]);
//		}
		AddArray obj = new AddArray();
		int arr3[] = obj.sum(arr1, arr2);

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

	public int[] sum(int a[], int b[]) {
		int arr[] = new int[a.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a[i] + b[i];
		}
		return arr;
	}

}
