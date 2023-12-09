package Complex;

import java.util.Arrays;

public class SecondMaxvalueArray {

	public static void main(String[] args) {
		Integer a[] = { 20, 30, 70, 40, 60 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("Maximum value: " + max);
		Arrays.sort(a);
		System.out.println("Array: " + Arrays.toString(a));
		int i = a[a.length - 2];
		System.out.println(i);

	}
}
