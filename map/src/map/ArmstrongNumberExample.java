package map;

import java.util.Scanner;

public class ArmstrongNumberExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = Integer.parseInt(s.nextLine());
		int p = 0, temp = n;
		for (int i = 1; i <= n; i++) {
			int rem = n % 10;
			p = p + (rem * rem * rem);
			n = n / 10;
			// System.out.println(p);

		}
		System.out.println(p);
		if (temp == p)
			System.out.println(n);
		else
			System.out.println("not armstrong");

	}

}
