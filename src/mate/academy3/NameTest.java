package mate.academy3;

import java.util.Scanner;

public class NameTest {

	public static void main(String[] args) {

		String fioInput;
		String fioOutput;
		int symbolInt;

		System.out.print("Enter your FIO: ");

		Scanner sc = new Scanner(System.in);

		fioInput = sc.nextLine();

		sc.close();

		System.out.println("\n");

		StringBuilder builder = new StringBuilder();
		String fioOutputTemp = fioInput.substring(0, 1).toUpperCase();
		builder.append(fioOutputTemp);
		fioOutputTemp = fioInput.substring(1, fioInput.length() - 4);
		builder.append(fioOutputTemp);
		fioOutputTemp = fioInput.substring(fioInput.length() - 4, fioInput.length() - 3).toUpperCase();
		builder.append(fioOutputTemp);
		fioOutputTemp = fioInput.substring(fioInput.length() - 3, fioInput.length() - 2);
		builder.append(fioOutputTemp);
		fioOutputTemp = fioInput.substring(fioInput.length() - 2, fioInput.length() - 1).toUpperCase();
		builder.append(fioOutputTemp);
		fioOutputTemp = fioInput.substring(fioInput.length() - 1, fioInput.length());
		builder.append(fioOutputTemp);
		System.out.println(builder);

		// ---------------------------------------------------------------------------

		char[] fioArray = fioInput.toCharArray();

		for (int i = 0; i < fioArray.length; i++) {
			if (i == 0) {
				symbolInt = fioArray[i] - 32;
				fioArray[i] = (char) symbolInt;
			} else if (fioArray[i] == '.') {
				symbolInt = fioArray[i - 1] - 32;
				fioArray[i - 1] = (char) symbolInt;
			}
		}

		fioOutput = String.valueOf(fioArray);
		System.out.println("Your FIO is: " + fioOutput);

	}

}
