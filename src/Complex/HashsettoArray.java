package Complex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashsettoArray {

	public static void main(String[] args) {
		HashSet<String> l = new HashSet<String>();
		l.add("Muthuraj");
		l.add("Muthu");
		l.add("Raj");

		String[] ar = new String[l.size()];
		l.toArray(ar);
		for (String arl : ar) {
			System.out.println(arl);
		}
	}

}
