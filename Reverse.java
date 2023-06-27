package in.co.rays;

public class Reverse {

	public static void main(String[] args) {

		int n = 33456;
		int a = 0;
		int b;

		while (n != 0) {

			b = n % 10;

			a = a * 10 + b;

			n = n / 10;
		}

		System.out.println(a);
	}

}
