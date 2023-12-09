package Complex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Maximumnumber {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(4);
		a.add(50);
//		for (int i = 0; i < arr.length; i++) {
//			a.add(arr[i]);
//		}
		System.out.println("Maximum element:" + Collections.max(a));
	}
}
