package Complex;

public class Singledigit {

	public static void main(String[] args) {
		// 1st Method
		int d = 123456;

		int r = d % 9;
		if (r <= 9) {
			System.out.println("Single Digit: " + r);
		} else {
			System.out.println("N/A: " + r);
		}
		// 2nd Method
//		int d = 94;
//		if (d < 10) {
//			System.out.println(d);
//		}
//		int sum = 0, r = 0;
//		while (d > 0) {
//			r = d % 10;
//			sum = sum + r;
//			d = d / 10;
//		}
//		System.out.println(sum);

	}
}
