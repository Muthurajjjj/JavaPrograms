package Complex;

import java.util.Iterator;

public class DuplicateString {

	public static void main(String[] args) {
		String names[] = { "Muthuraj", "Vichuu", "Meta", "Facebook", "Twitter", "Meta", "HP", "Dell", "HP" };
		int c = 0;
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					System.out.println("Duplicate String: " + names[j]);
					c++;
				}
			}
		}
		System.out.println("Duplicate String Count: " + c);
	}

}
