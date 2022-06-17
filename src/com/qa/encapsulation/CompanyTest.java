package com.qa.encapsulation;

public class CompanyTest {

	public static void main(String[] args) {

		Company obj = new Company();

		obj.setName("Google");
		obj.setTotalEmp(10000);
		obj.setCeoName("Sundar pichai");

		// System.out.println(obj.policy); object or user doesnt have direct access to
		// this private variable policy but indirect access through setter and getter
		// we have created wrappers, wrapped private variable with public methods
		obj.setPolicy("financial");
		// Company.policy is private whose scope is within class,we dnt have direct
		// access to this variable so through
		// getter and setter we are indirectly using it, getter and setter are wrpaer
		// method, they wraped variable

		System.out.println(obj.getName());
		System.out.println(obj.getTotalEmp());
		System.out.println(obj.getCeoName());

		System.out.println(obj.getPolicy());

		Company obj2 = new Company();
		obj2.setName("Microsoft");

	}
}
