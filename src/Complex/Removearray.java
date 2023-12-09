package Complex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removearray {

	public static void main(String[] args) {
//		int[] d = { 10, 20, 20, 30, 40, 40, 50, 60, 60 };
//		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
//		for (Integer i : d) {
//			if (s.add(i) == true) {
//				System.out.println(i);
//			}
//		}

		// 2nd
		int a[] = { 10, 20, 20, 30, 30, 40, 50 };
		int len = a.length - 1;
		int k = 0;

		for (int i = 0; i < len; i++) {
			if (a[i] != a[i + 1]) {
				a[k++] = a[i];
			}
		}

		a[k++] = a[len];

		for (int  f = 0; f < k; f++) {
			System.out.println(a[f]);
		}

	}
}
