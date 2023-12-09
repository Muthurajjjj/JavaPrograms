package Complex;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Muthuraj");
		l.add("Muthu");
		l.add("Raj");

		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);

	}
}
