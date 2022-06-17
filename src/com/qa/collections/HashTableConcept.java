package com.qa.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable<String, String> user1=new Hashtable<String,String>();
		
		Map<String, Integer> productTabe=new Hashtable<String, Integer>();
		
		productTabe.put("Apple", 2000);
		productTabe.put("Windows", 1000);
		productTabe.put("Apple iphone", 1500);
		//productTabe.put(null, 1);// java.lang.NullPointerException
		//productTabe.put("Apple watch", null);// java.lang.NullPointerException
		
		System.out.println(productTabe);
		System.out.println(productTabe.size());
		System.out.println(productTabe.get("Apple"));
		System.out.println(productTabe.get("Apple2"));
		
	
		System.out.println(productTabe.get("Apple"));
		
		for(Map.Entry m:productTabe.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Set<String> keys=productTabe.keySet();
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println(key+"-->"+productTabe.get(key));
			
		}
		
	}

}
