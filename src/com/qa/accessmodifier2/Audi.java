package com.qa.accessmodifier2;

import com.qa.accessmodifier.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.color);
		//System.out.println(c.price);//The field Car.price is not visible
		
		//System.out.println(c.name);//The field Car.name is not visible
		
		Audi a=new Audi();
		System.out.println(a.type);
	}
	
}
