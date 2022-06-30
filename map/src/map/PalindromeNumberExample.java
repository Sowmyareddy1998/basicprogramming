package map;

import java.util.Scanner;

public class PalindromeNumberExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = Integer.parseInt(s.nextLine());
		int temp = n, p = 0;
		while (n != 0) {
			int rem = n % 10;
			p = p * 10 + rem;
			n = n / 10;
		}
		if (temp == p)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
	}

}
