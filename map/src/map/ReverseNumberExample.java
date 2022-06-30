package map;

import java.util.Scanner;

public class ReverseNumberExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = Integer.parseInt(s.nextLine());
		int rev = 0;

		while (n != 0) {
			int remainder = n % 10;
			rev = rev * 10 + remainder;
			n = n / 10;
		}
		System.out.println("The reverse of the given number is: " + rev);

	}

}
