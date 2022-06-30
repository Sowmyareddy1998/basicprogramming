package map;

import java.util.Scanner;

public class SumNaturalNumbers {

	public static void main(String[] args) {

		int sum = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("enter n value ");
		int n = Integer.parseInt(s.nextLine());

		for (int i = 0; i <= n; i++) {
			sum = sum + i;
			System.out.println(sum);
		}

	}

}
