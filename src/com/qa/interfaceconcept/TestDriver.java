package com.qa.interfaceconcept;

public class TestDriver {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();
		cd.launchBrowser();
		cd.getTitle();
		cd.click();
		cd.closeBrowser();

		cd.launchUrl();
		cd.maximize();

		cd.headLess();
		cd.incognitoMode();
		
		cd.getCookies();
		cd.getHeader();
		
		//WebDriver.default_time_out=10;
		System.out.println(WebDriver.default_time_out);
		//System.out.println(cd.default_time_out);
		
		cd.run();

		System.out.println("---------");

		//top casting/up casting
		WebDriver driver = new ChromeDriver();
		driver.launchBrowser();
		driver.getTitle();
		driver.click();
		driver.closeBrowser();
		driver.run();
		
		WebDriver.visual();
		
		
		//new WebDriver(); //Cannot instantiate the type WebDriver cannot create object of an interface strictly not allowed
		System.out.println("---------");
		WebBrowser wb=new ChromeDriver();
		wb.getCookies();
		wb.getHeader();
		
		
		
		
		
	}

}
