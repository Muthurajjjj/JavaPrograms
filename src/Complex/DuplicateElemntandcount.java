package Complex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateElemntandcount {

	public static void main(String[] args) {
		String names[] = { "Muthuraj", "Vichuu", "Meta", "Facebook", "Twitter", "Meta", "HP", "Dell", "HP" };

		Set<String> s = new HashSet<String>();
		int count = 0;
		for (String name : names) {
			if (s.add(name) == false) {
				System.out.println("Duplicate Element: " + name);
				count++;
			}
		}
		System.out.println("Duplicate Count: " + count);
	}

}
