package com.qa.javasessions;
/*
 * Program to find Maximum Occurring Character in String by using ASCII value
 */
public class MaximumOcurringCharacter {

	public static void main(String[] args) {
		
		String s2="abbccc";
		String s = "this is my first java";
		s=s.replace(" ", "");
		int max=-1;
		char c=' ';
		
		int arr[]=new int[127];
		
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		
		for(int i=0;i<s.length();i++)
		{
			if (arr[s.charAt(i)]>=max) {
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("Maximum occurence of character is: "+c+" by "+ max+" times");

	}

}
