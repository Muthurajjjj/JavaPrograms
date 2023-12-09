package Complex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapIterations {
	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Muthuraj", 1);
		m.put("Vichuu", 2);
		m.put("Raj", 3);
		m.put("MS", 7);
		//Method 1
		System.out.println("First Method::::");

		for (Map.Entry<String, Integer> iterator : m.entrySet()) {
			String s = iterator.getKey();
			int i = iterator.getValue();
			System.out.println("key:" + s + " Value :" + i);
		}
		//Method 2
		System.out.println("Second Method::::");

		Set<Entry<String, Integer>> set = m.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println("key:" + entry.getKey() + " Value: " + entry.getValue());
		}
	}
}