package com.qa.interfaceconcept;

public class TestBrowser {

	public static void main(String[] args) {

		WebDriver driver = null;
		String browserName = "firefox";

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println(browserName + " not found");
		}
		driver.launchBrowser();
		driver.getTitle();
		driver.click();
		driver.closeBrowser();

	}
}
