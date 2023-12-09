package Complex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseArraylist {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Muthuraj");
		l.add("Raj");
		l.add("vichuu");

		Collections.sort(l, Collections.reverseOrder());

//		Iterator<String> i=l.iterator();
//		while (i.hasprevious()) {
//			String string = (String) i.previous());
//		}
		System.out.println(l);

	}
}