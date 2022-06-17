package com.qa.accessmodifier;

public class Test {

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.color);
		//System.out.println(c.price);//The field Car.price is not visible
		
		System.out.println(c.name);
		System.out.println(c.type);
		
	
	}

}
