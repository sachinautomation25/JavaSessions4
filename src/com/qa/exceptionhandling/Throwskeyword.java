package com.qa.exceptionhandling;

public class Throwskeyword {

	public static void main(String[] args) throws Exception {

		new Throwskeyword().launchBrowser();
	}

	public void launchBrowser() throws Exception {
		System.out.println("launchBrowser");
		checkBrowserversion();
	}

	public void checkBrowserversion() throws Exception {
		System.out.println("checkBrowserversion");
		checkOS();
	}

	public void checkOS() throws Exception{
		System.out.println("checkOS");
		int i=9/0;
	}
}
