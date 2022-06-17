package com.qa.javasessions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 *  Suppose I have above HashMap of Countries and Continent. So my requirement is in output a Map should be returned with count of countries with continent...
for example output should be like {Asia=3, Europe=2,}
 */
public class ContinentCount2 {

	public static void main(String[] args) {

		HashMap<String, String> countries = new HashMap<String, String>();
		countries.put("India", "Asia");
		countries.put("bangladesh", "Asia");
		countries.put("England", "Europe");
		countries.put("Ireland", "Europe");
		countries.put("Srilanka", "Asia");

		Map<String, Integer> continents=new HashMap<String, Integer>();
		
		Collection<String> values=countries.values();
		
		for(String key:values)
		{
			continents.put(key, continents.getOrDefault(key, 0)+1);
		}
		System.out.println(continents);
		
		
	}

}
