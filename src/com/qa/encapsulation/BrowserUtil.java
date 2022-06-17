package com.qa.encapsulation;
/*
 * interact with os,check how many ram allocated for browser,browser available compatible
 * with private access modifier we have hidden internal implementation to outside world. Now,user can access only one method to launch browser
 * BrowserUtil is a library having different methods or api
 * u tak example of any library in the world,they will not exposed all the methods/api to user
 */
public class BrowserUtil {

	public void launchBrowser() {
		System.out.println("launching browser");
		isBrowserExist();
		System.out.println("launched browser");

	}

	private void isBrowserExist() {
		System.out.println("isBrowserExist");
		checkOsComptability();
	}

	private void checkOsComptability() {
		System.out.println("checkOsComptability");
		checkRAMAllocated();
	}

	private void checkRAMAllocated() {
		System.out.println("checkRAMAllocated");
	}
}
