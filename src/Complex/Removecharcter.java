package Complex;

import java.util.Arrays;

public class Removecharcter {

	public static void main(String[] args) {
		String s = "Muthurajjjjjjjjjjjjjjjjjjjj";
		String r = "";

		for (int i = 0; i < s.length(); i++) {
			String ch = "" + s.charAt(i);
			if (r.contains(ch)) {
				continue;
			}
			r = r + ch;
		}
		System.out.println(r);
	}
}