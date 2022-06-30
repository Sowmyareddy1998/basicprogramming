package map;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = Integer.parseInt(s.nextLine());
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

	}

}
