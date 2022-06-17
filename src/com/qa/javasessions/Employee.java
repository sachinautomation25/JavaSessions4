package com.qa.javasessions;

public class Employee {
	// data members/class members/properties- data types/variable and
	// methods/functions
	// class properties will be shared by each class object

	String name;
	int age;
	int empId;
	String deptName;
	long phoneNumber;

	char gender;
	boolean isActive;
	double salary;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "naveen";
		e1.age = 30;
		e1.empId = 123;
		e1.deptName = "QA";
		e1.phoneNumber = 9999999999l;
		e1.gender = 'm';
		e1.isActive = true;
		e1.salary = 10.0;

		Employee e2 = new Employee();
		e2.name = "vani";
		e2.age = 34;
		e2.empId = 124;
		e2.deptName = "Account";
		e2.phoneNumber = 999999999;

		System.out.println(e1.name + " " + e1.age + " " + e1.empId + " " + e1.deptName + " " + e1.phoneNumber + " "
				+ e1.gender + " " + e1.isActive + " " + e1.salary);
		System.out.println(
				e2.name + " " + e2.age + " " + e2.empId + " " + e2.empId + " " + e2.deptName + " " + e2.phoneNumber);

		Employee e3 = new Employee();
		e3.name = "swati";
		e3.age = 30;
		e3.empId = 125;

		System.out.println(e3.name + " " + e3.age + " " + e3.empId + " " + e3.deptName + " " + e3.phoneNumber + " "
				+ e3.gender + " " + e3.isActive + " " + e3.salary);

		Employee e4 = new Employee();

		System.out.println(e4.name + " " + e4.age + " " + e4.empId + " " + e4.deptName + " " + e4.phoneNumber + " "
				+ e4.gender + " " + e4.isActive + " " + e4.salary);

		new Employee().name = "rahul";// new object created without reference name
		//not a right or good practice,eligible for GC

	}
}
