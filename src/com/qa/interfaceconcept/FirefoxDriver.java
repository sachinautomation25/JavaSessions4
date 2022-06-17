package com.qa.interfaceconcept;

public class FirefoxDriver extends WebBrowser implements WebDriver, Protractor {

	@Override
	public void launchUrl() {
		System.out.println("FirefoxDriver--launchUrl");
	}

	@Override
	public void maximize() {
		System.out.println("FirefoxDriver--maximize");
	}

	@Override
	public void launchBrowser() {
		System.out.println("FirefoxDriver--launchBrowser");
	}

	@Override
	public void getTitle() {
		System.out.println("FirefoxDriver--getTitle");// TODO Auto-generated method stub

	}

	@Override
	public void click() {
		System.out.println("FirefoxDriver--click");
	}

	@Override
	public void closeBrowser() {
		System.out.println("FirefoxDriver--closeBrowser");
	}

}
