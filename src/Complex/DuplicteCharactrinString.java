package Complex;

public class DuplicteCharactrinString {

	public static void main(String[] args) {
		String s = "uurre";
		int c = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Repeated Characters: " + ch[i]);
					c++;
				}
			}
		}
		System.out.println("Repeated Characters: " + c);
	}
}
