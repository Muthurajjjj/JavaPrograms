package Complex;

public class RemoveString {

	public static void main(String[] args) {
		//
		String s[] = { "fb", "mb", "mb" };

		for (int i = 0; i < s.length; i++) {

			if (s[i] != s[i + 1]) {
				continue;
			}
			System.out.println(s[i]);
		}
	}
}
