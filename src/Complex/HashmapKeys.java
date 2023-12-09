package Complex;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashmapKeys {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(3, "Muthuraj");
		m.put(8, "Vichuu");
		m.put(1, "Raj");
		System.out.println("Before");

		Set<Entry<Integer, String>> set = m.entrySet();
		for (Entry<Integer, String> key : set) {
			System.out.println("Key: " + key.getKey() + " Value:" + key.getValue());
		}

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(m);
//		Set<Entry<Integer, String>> entry = tm.entrySet();
//		Iterator<Entry<Integer, String>> it = entry.iterator();
//		System.out.println("After");
//		while (it.hasNext()) {
//			Map.Entry<Integer, String> m1 = (it).next();
//			System.out.println("Key: " + m1.getKey() + " Value:" + m1.getValue());
//
//		}
		Set<Entry<Integer, String>> sett = tm.entrySet();
		System.out.println("After");
		for (Entry<Integer, String> key : sett) {
			System.out.println("Key: " + key.getKey() + " Value:" + key.getValue());
		}

	}

}
