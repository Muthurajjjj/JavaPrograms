package Complex;

public class Sumofdigit {

	public static void main(String[] args) {
		int a = 941;
		int i, j, k;
		i = 0;
		j = 0;
		k = 0;

		while (a > 0) {
			i = a % 10;
			j = j + i;
			a = a / 10;
		}
		System.out.println(j);
		k=j%9;
		System.out.println(k);

	}

}
