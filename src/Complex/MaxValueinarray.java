package Complex;

public class MaxValueinarray {

	public static void main(String[] args) {
		int a[] = { 20, 30, 70, 40, 60 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("Maximum value: " + max);
	}
}
