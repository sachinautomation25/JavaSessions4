package com.qa.staticnonstaticconcept;

public class Question6 {

	String name;
	static int age;
	
	static
	{
		Question6 obj=new Question6();
		obj.name="naveen";
		
		age=30;
		
	}
	public static void main(String[] args) {
		

	}

}
