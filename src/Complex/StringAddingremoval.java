package Complex;

public class StringAddingremoval {

	public static void main(String[] args) {
		String s = "a2b3c4";// aabbbcccc
		s = s.replaceAll("[0-9]", "");
		System.out.println(s);

		StringBuffer str = new StringBuffer(s);
		str.insert(1, "a");
		str.insert(2, "bb");
		str.insert(5, "ccc");
		System.out.println(str);
		// input- demo and output- deemmmoooo
		String txt = "demo";

		StringBuffer txt1 = new StringBuffer(txt);
		txt1.replace(1, 4, "eemmmoooo");
		System.out.println(txt1);
	}
}
