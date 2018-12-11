package mate.academy3;

import java.util.Scanner;

public class DiscountTest {

	public static void main(String[] args) {

		int total = 400;
		int discount = 0;

		System.out.print("Enter your SUM: ");

		Scanner sc = new Scanner(System.in);

		total = sc.nextInt();

		sc.close();

		switch (total / 100) {
		case 0:
		case 1:
		case 2:
			discount = 0;
			System.out
					.println("Your discount is " + discount + " %, total to pay: " + (total - total / 100 * discount));
			break;

		case 3:
			discount = 3;
			System.out
					.println("Your discount is " + discount + " %, total to pay: " + (total - total / 100 * discount));
			break;

		default:
			discount = 5;
			System.out
					.println("Your discount is " + discount + " %, total to pay: " + (total - total / 100 * discount));
			break;
		}

	}

}
