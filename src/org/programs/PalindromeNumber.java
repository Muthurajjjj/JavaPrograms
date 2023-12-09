package org.programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		int a = 121;
		int i = 0, j = 0;

		while (a > 0) {
			i = a % 10;// 1;2
			j = (j * 10) + i;// 1//12
			a = a / 10;// 12//1

		}
		System.out.println("j:" + j);
		a = 121;
		if (j == a) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Non-Palindrome");
		}
	}
}
