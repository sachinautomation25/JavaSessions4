package com.qa.abstractclass;

public abstract class Page {

	public Page() {
		System.out.println("Page--default const");
	}

	public abstract void header();
	
	public abstract void header(int a);

	public abstract void footer();

	public final void privacyPolicy() {
		System.out.println("Page--privacyPolicy");
	}
	public final void logo() {
		System.out.println("Page--logo");
	}
	// No abs method- 0% abstraction
	// some abs methods and some non abs methods-partial abstraction
	// only abs methods-100% abstraction
	
	//we can achieve 0 to 100% abstraction through abstract class
	

}
