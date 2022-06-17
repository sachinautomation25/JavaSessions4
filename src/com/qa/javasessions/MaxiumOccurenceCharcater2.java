package com.qa.javasessions;

import java.util.Hashtable;
import java.util.Map;

/*
 * Program to find Maximum Occurring Character in String by using Map
 */
public class MaxiumOccurenceCharcater2 {

	public static void main(String[] args) {

		String s = "abbccc";
		int max=-1;
		char maxChar=' ';

		Map<Character, Integer> map = new Hashtable<Character, Integer>();

		char c[] = s.toCharArray();

		for (char d : c) {
			if (map.containsKey(d)) {
				map.put(d, map.get(d) + 1);
			} else {
				map.put(d, 1);
			}
		}
		for(Map.Entry<Character, Integer> m:map.entrySet())
		{
			if(m.getValue()>=max)
			{
				max=m.getValue();
				maxChar=m.getKey();
			}
				
		}
		System.out.println("Maximum occurence charcater is: "+maxChar+" by "+max+" times");
	}

}
