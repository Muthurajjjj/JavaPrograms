package Complex;

import java.util.HashMap;
import java.util.Scanner;

public class Stringoccurnce {

	public static void main(String[] args) {
//		String str = "Muthuraj";
//		HashMap<Character, Integer> hMap = new HashMap<>();
//		for (int i = str.length() - 1; i >= 0; i--) {
//			if (hMap.containsKey(str.charAt(i))) {
//				int count = hMap.get(str.charAt(i));
//				hMap.put(str.charAt(i), ++count);
//			} else {
//				hMap.put(str.charAt(i), 1);
//			}
//		}
//		System.out.println(hMap);
		// 2nd
		String s = "Muthurajj";
		int c = 0;
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					c++;
				}
			}
			System.out.println(ch[i] + " " + c);
			c = 0;
		}
	}
}
