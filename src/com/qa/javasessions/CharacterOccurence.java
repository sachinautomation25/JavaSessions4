package com.qa.javasessions;

import sun.security.util.Length;

/*
 *  Count the occurrences of a character in a String
 *  
 */
public class CharacterOccurence {

	public static void main(String[] args) {
		
		String s="i love coding";
		
		char c='i';
//		int count = 0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			if (s.charAt(i)==c) {
//				count++;
//			}
//		}
//		System.out.println("charcater "+c+" occured "+count+" times");
		
		getCharacterOccurence2("i love coding", 'i');
	}
	/*
	 * we can use upto the length of string
	 * s.length()
	 * compare the value charAt(i) with chararcater--if matched then increase the count by 1
	 */
	public static void getCharcaterOccurence(String s,char value) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==value) {
				count++;
			}
		}
		System.out.println("charcater "+value+" occured "+count+" times");
	}
	//we can convert the string into character array and then iterate through for loop
	public static void getCharacterOccurence2(String s,char c) {
		int count = 0;
		char ch[]=s.toCharArray();
		for(char value:ch)
		{
			if (c==value) {
				count++;
			}
		}
		System.out.println("charcater "+c+" occured "+count+" times");
	}

}
