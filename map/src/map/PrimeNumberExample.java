package map;

import java.util.Scanner;

public class PrimeNumberExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int num = Integer.parseInt(s.nextLine());
		int count = 0;
//
//		for (int i = 1; i <= num; i++) {
//			count = 0;
//			for (int j = 2; j <= i / 2; j++) {
//				if (i % j == 0) {
//					count++;
//					break;
//				}
//			}
//
//			if (count == 0) {
//				System.out.println(i);
//				
//			}
//		}

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
				break;

			}

		}

		if (count == 0)
			System.out.println(num + "prime");
		else
			System.out.println(num + "non prime");
	}

}
