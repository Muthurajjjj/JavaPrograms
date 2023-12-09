package Complex;

public class Stringdigitremoval {

	public static void main(String[] args) {
		String s = "a2b3c4";
		String r = "";

		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				r = r + s.charAt(i);

			}
		}
		System.out.println(r);
		StringBuffer txt = new StringBuffer(r);
		txt.replace(1, 3, "TwobThreecFour");
		System.out.println(txt);
	}

}
