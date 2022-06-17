package com.qa.staticnonstaticconcept;

public class StaticAndNonStaticConcept2 {

	String name = "Tom";// non static variable-instance variable
	static int age = 30;// static variable

	public static void main(String[] args) {

		// how to call static methods and variables?
		// 1. direct calling:
		System.out.println(age);
		sum();
		// 2. calling by classname:
		StaticAndNonStaticConcept2.sum();
		System.out.println(StaticAndNonStaticConcept2.age);

		// 2.how to call non static methods and variables:
		StaticAndNonStaticConcept2 obj = new StaticAndNonStaticConcept2();
		System.out.println(obj.name);
		obj.sendMail();
		
		//3. can i access static property by using object refernce
		obj.age=35;
		obj.sum();
		
		System.out.println(age);
	}

	public void sendMail() {// non static method
		System.out.println("send mail method");
		sum();
		//StaticAndNonStaticConcept2.sum();
	}

	public static void sum() {// static method
		System.out.println("sum method");
		//new StaticAndNonStaticConcept2().sendMail();
	}
	
	

}
