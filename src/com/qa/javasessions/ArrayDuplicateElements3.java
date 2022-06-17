package com.qa.javasessions;

/*
 * Find Duplicate Elements in an Array-HashMap
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Find Duplicate Elements in an Array-HashMap
 */
public class ArrayDuplicateElements3 {

	public static void main(String[] args) {

		int array[] = { 2, 4, 2, 5, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i : array) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
			}

		}

	}
}
