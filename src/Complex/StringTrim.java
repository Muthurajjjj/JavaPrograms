package Complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringTrim {

	public static void main(String[] args) {
		String[] s = { "One", "2", "three", "4" };

		ArrayList<String> l = new ArrayList<String>();
		for (String arr : s) {
			l.add(arr);
		}

		l.remove(1);
		l.remove(2);
		l.add(1, "Two");
		l.add(3, "Four");
		System.out.println(l.toString());

	}
}