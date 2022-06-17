package com.qa.javasessions;

public class User {

	String name;
	int age;
	long phoneNumber;
	String address;
	char gender;
	boolean isActive;

	public User() {// 0 param or default const const can be overload

		System.out.println("0 param const...");
	}

	public User(int a)// 1 param const
	{
		System.out.println("1 param const...");
	}

	public User(String name, int age) {
		System.out.println("1 param const..." + name + " " + age);
		this.name = name;
		this.age = age;

	}

	public User(String name, int age, long phoneNumber, String address, char gender, boolean isActive) {

		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		// User u1 = new User();
//		u1.name="neha";
//		u1.age=30;  verbose code avoid this approach

		// User u1=new User();
		User u2 = new User(10);

		User u3 = new User("Deepak", 30);

		User u4 = new User("Rahul", 32, 9999999999l, "Delhi", 'm', true);
		User u5=new User("Naveen", 32, 999999999, "banglore", 'm', true);

		System.out.println(
				u4.name + " " + u4.age + " " + u4.phoneNumber + " " + u4.address + " " + u4.gender + " " + u4.isActive);
		System.out.println(
				u5.name + " " + u5.age + " " + u5.phoneNumber + " " + u5.address + " " + u5.gender + " " + u5.isActive);

	}
}
