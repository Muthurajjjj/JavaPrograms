package Complex;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String s1 = "Race".toLowerCase();
		String s2 = "care".toLowerCase();
		System.out.println(s1 + "\n" + s2);
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch1) + "\n" + Arrays.toString(ch2));
		boolean r = Arrays.equals(ch1, ch2);

		if (r) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
