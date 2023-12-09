package Complex;

public class BubblesortArray {

	public static void main(String[] args) {

		int b[] = { 1, 10, 8, 2, 3 };
		int t = 0;

		for (int i = 0; i < b.length; i++) {
			for (int j = 1; j < b.length - i; j++) {
				if (b[j - 1] > b[j]) {
					t = b[j - 1];
					b[j - 1] = b[j];
					b[j] = t;
				}
			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
