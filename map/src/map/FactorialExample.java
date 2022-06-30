package map;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = Integer.parseInt(s.nextLine());
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.println(fact);
		}

	}

}
