package Complex;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {
		int i[] = { 10, 20, 30, 40, 50 };
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		int result = i[i.length - 2];
		System.out.println(result);

	}

}
