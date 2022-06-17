package com.qa.javasessions;

public class SwitchCaseConcept2 {

	public static void main(String[] args) {

		String browserName = "ie";

		switch (browserName) {
		case "chrome":
			System.out.println("chrome launched");
			break;
		case "firefox":
			System.out.println("firefox lauched");
			break;
		case "safari":
			System.out.println("safari laucnhed");
			break;
		case "ie":
			System.out.println("ie laucnhed");
			break;
		default:
			System.out.println(browserName + " not found");
			break;
		}
	}
}
