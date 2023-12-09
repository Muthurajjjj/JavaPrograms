package Complex;

import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String names = "Muthuraj";
		StringBuilder s = new StringBuilder(names);
		s.reverse();
		System.out.println(s);

		StringBuffer name = new StringBuffer(names);
		name.reverse();
		System.out.println(name);

	}

}