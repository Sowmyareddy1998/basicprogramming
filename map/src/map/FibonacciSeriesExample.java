package map;

import java.util.Scanner;

public class FibonacciSeriesExample {

	public static void main(String[] args) {
		int n3, sum = 0, n = 10;
		Scanner s = new Scanner(System.in);
		System.out.println("enter n1 value");
		int n1 = Integer.parseInt(s.nextLine());
		System.out.println("enter n2 value");
		int n2 = Integer.parseInt(s.nextLine());

		System.out.println(n1 + " " + n2);
		for (int i = 2; i <= n; i++) {
			n3 = n1 + n2;
			System.out.println(n3);

			n1 = n2;
			n2 = n3;

		}

	}

}
