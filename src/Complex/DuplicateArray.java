package Complex;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 3 };
		System.out.println("Duplicate Array is:");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);

				}
			}
		}

	}
}