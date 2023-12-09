package Complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		String[] name = { "m", "u", "t", "h", "u" };
		List<String> l = new ArrayList<String>(Arrays.asList(name));
		Collections.addAll(l, name);
		for (String list : l) {
			System.out.println(list);
		}
		int i = l.size();
		System.out.println(i);
	}
}
