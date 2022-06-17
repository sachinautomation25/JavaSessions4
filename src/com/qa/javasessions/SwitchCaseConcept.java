package com.qa.javasessions;

/*
 * switch case similar to if else but swicth will directly jump to matching case,performance wise better faster than if else
 * also it depend upon my use case 
 */
public class SwitchCaseConcept {

	public static void main(String[] args) {

		int bill = 300;

		switch (bill) {
		case 100:
			System.out.println("hey your bill is 100 USD");
			break;
		case 200:
			System.out.println("hey your bill is 200 USD");
			break;
		case 300:
			System.out.println("hey your bill is 300 USD");
			break;
		case 400:
			System.out.println("hey your bill is 400 USD");
			break;
		default:
			System.out.println("case not found");
			break;
		}
	}

}
