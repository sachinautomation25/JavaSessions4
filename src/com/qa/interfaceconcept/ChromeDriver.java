package com.qa.interfaceconcept;

public class ChromeDriver extends WebBrowser implements WebDriver, Protractor {

	// WebDriver I
	@Override
	public void launchBrowser() {
		System.out.println("ChromeDriver--launchBrowser");

	}

	@Override
	public void getTitle() {
		System.out.println("ChromeDriver--getTitle");
	}

	@Override
	public void click() {
		System.out.println("ChromeDriver--click");
	}

	@Override
	public void closeBrowser() {
		System.out.println("ChromeDriver--closeBrowser");
	}

	// Protractor I
	@Override
	public void launchUrl() {
		System.out.println("ChromeDriver--launchUrl");
	}

	@Override
	public void maximize() {
		System.out.println("ChromeDriver--maximize");
	}

	// ChromeDriver methods
	public void headLess() {
		System.out.println("ChromeDriver--headLess");
	}

	public void incognitoMode() {
		System.out.println("ChromeDriver--incognitoMode");
	}
	
	@Override
	public void getCookies()
	{
		System.out.println("ChromeDriver--getCookies");
		
	}

}
