package com.qa.staticnonstaticconcept;

public class Question4 {
	int age;

	private Question4() {
		age = 30;
	}

	static {
		Question4 obj = new Question4();
	}

	public static int createObject() {
		Question4 obj = new Question4();
		obj.age = 40;
		return obj.age;
	}

	public static void main(String[] args) {

		Question4 obj = new Question4();
		System.out.println(obj.age);
	}

}
