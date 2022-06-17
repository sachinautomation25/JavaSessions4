package com.qa.arrayconcept;

/*
 * creating an array of type class-Testing
 */
public class Testing {

	public static void main(String[] args) {

		Testing test[] = new Testing[5];// i am creating an array with name test of testing type,this array contains
										// value of type Testing i.e object of Testing class

		test[0] = new Testing();

		for (int i = 1; i < test.length - 1; i++) {
			test[i] = new Testing();
		}

		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}

		Testing obj;// i can store Testing type of value in obj variable or reference variable(can
					// only contain address of an object)
//		obj=10;//Type mismatch: cannot convert from int to Testing
		// obj can only contain address of an object of class Testing

	}
}
