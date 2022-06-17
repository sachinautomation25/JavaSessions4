package com.qa.collections;
/*
 * in set insertion order is not maintained
 * duplicate values are not allowed in set
 * 
 * arraylist where insertion order maintain is important,duplicate values are required
 * when insertion order is not important and duplicate are not allowed only unique values required then go for set
 * if we tried to store duplicate values in set then values are replaced or overridden
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		System.out.println(set.size());

		set.add("naveen");
		set.add("rahul");
		set.add("deepak");
		set.add("naveen");
		set.add(null);
		set.add(null);
		// set.add(1);

		System.out.println(set.size());
		System.out.println(set);

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String text = itr.next();
			System.out.println(text);
		}

	}

}
