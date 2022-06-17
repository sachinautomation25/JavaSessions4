package com.qa.inheritance;

public class TestCar {

	public static void main(String[] args) {

		final int i=10;
		//i=20;
		
		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.tyreAirPressure();
		b.engine();
		

		b.sunRoof();

		System.out.println("----------");

		Car c = new Car();
		c.start();
		c.stop();
		c.tyreAirPressure();
		c.engine();

		// c.sunRoof(); parent cannot take anything from child and sunRoof is special
		// method of child so this is not allowed

		System.out.println("----------");

		//top casting or up casting 
		Car c1 = new Bmw();// child class object can be refered by parent class refernce variable
		c1.start();
		c1.stop();
		c1.tyreAirPressure();
		//c1.sunRoof();// sunRoof is special method of Bmw,neither overiden or inherited method from
						// parent, reference check will come in play only Bmw refernce or Bmw child
						// which going to inherit this method will access. Parent of Bmw is unaware of
						// this method so cant access
		
		//down casting is not allowed in java
		//Bmw bmw=(Bmw) new Car();//java.lang.ClassCastException: com.qa.inheritance.Car cannot be cast to com.qa.inheritance.Bmw
		//java.lang.ClassCastException we are destroying state of object,destroying the object
		//bmw.start();
		
		c1.engine();
		
		Vehicle v=new Bmw();
		v.engine();
		
		
		

	}
}
