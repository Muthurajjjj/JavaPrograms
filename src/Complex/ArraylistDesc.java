package Complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistDesc {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Muthuraj");
		l.add("Vichuu");
		l.add("Raj");
		Collections.sort(l, Collections.reverseOrder());
		l.add(0, "Vishnu");
		l.remove(0);
		for (String ls : l) {
			System.out.println(ls);
		}

	}
}
