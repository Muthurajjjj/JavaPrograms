package Complex;

public class StringoddEven {

	public static void main(String[] args) {
		String n = "";
		String s = "Muthuraj";
		int e = 0;
		int o = 0;
		for (int i = 0; i < s.length(); i++) {

			if (i % 2 == e) {
				n = n + s.charAt(i);
				e = i;
				System.out.println("Even: " + "\t" + e + "\t" + n);
			} else if (i % 2 == 1) {
				n = n + s.charAt(i);
				o = i;
				System.out.println("Odd: " + "\t" + o + "\t" + n);
			}
			n = "";
			e = 0;
			o = 0;
		}
	}
}
