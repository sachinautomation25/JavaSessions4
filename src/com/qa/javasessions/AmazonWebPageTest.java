package com.qa.javasessions;

public class AmazonWebPageTest {

	public static void main(String[] args) {

		// AmazonWebPage awp=new AmazonWebPage("Amazon", "amazon", "amazon");
		// AmazonWebPage awp=new AmazonWebPage("amazon");
		AmazonWebPage awp = new AmazonWebPage();

		AmazonWebPage awpI = new AmazonWebPage("India shopping", "amazon india", "privacy policy");
		AmazonWebPage awpG = new AmazonWebPage("Global shopping", "amazon global");

		System.out.println(awpI.title + " " + awpI.header + " " + awpI.footer);

	}

}
