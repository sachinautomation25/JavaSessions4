package com.qa.interfaceconcept;

public interface WebDriver {

	int default_time_out = 20;// by default static and final

	public void launchBrowser();

	public void getTitle();

	public void click();

	public void closeBrowser();

	// in interface both final and static not allowed for method prototypte/abstract
	// method
	// only method prototype/abstract method,only method declaration with no method
	// body
	
	default void run() {
		System.out.println("WebDriver--run");
	}
	public static void visual() {
		System.out.println("WebDriver--visual");	
	}

}
