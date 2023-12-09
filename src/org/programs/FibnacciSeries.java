package org.programs;

public class FibnacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(c);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
