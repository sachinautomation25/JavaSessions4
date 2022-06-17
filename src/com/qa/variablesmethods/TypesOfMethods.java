package com.qa.variablesmethods;

/*
 * static and non static methods
 */
public class TypesOfMethods {
	
	int a=10;
	static int b=20;

	public static void main(String[] args) {

		System.out.println(b);
		System.out.println(TypesOfMethods.b);
		
		TypesOfMethods obj=new TypesOfMethods();
		System.out.println(obj.a);
	}

	public void add() {

		System.out.println(b);
		System.out.println(TypesOfMethods.b);
		
		subtract();
		muliply();
		TypesOfMethods.subtract();
		
		new TypesOfMethods().muliply();
	}

	public void muliply() {

		add();
		new TypesOfMethods().add();
		
		TypesOfMethods.subtract();
		
		a=20;
		b=30;
	}

	public static void subtract() {

		//a=40;
		System.out.println(b);
		System.out.println(TypesOfMethods.b);
	}

}
