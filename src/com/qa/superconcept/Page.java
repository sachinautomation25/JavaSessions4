package com.qa.superconcept;

public class Page {

	String header;
	
	public Page()
	{
		System.out.println("Page--default const");
	}
	public Page(String header)
	{
		this.header=header;
		System.out.println("parent");
	}
	public void getHeader() {
		System.out.println("Page--getHeader");
	}
}
