package com.qa.superconcept;

public class LoginPage extends Page {

	
	String title;
	
	public LoginPage()
	{
		System.out.println("LoginPage--default const");
		
	}
	public LoginPage(String title)
	{
		super("title");
		super.getHeader();
		this.title=title;
		System.out.println("title: "+title);
		
	}
	public void getClassName() {
		super.getHeader();
		System.out.println("LoginPage--getClass");
	}
}
