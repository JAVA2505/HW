package mate.academy;

import java.util.Arrays;
import java.util.Scanner;

public class PhraseParsing {

	public static void main(String[] args) {

		String test;

		System.out.println("Enter row: ");
		Scanner in = new Scanner(System.in);

		test = in.nextLine();
		in.close();
		
		test = test.substring(0, test.length() - 1);
		
		String[] testArr = test.split("; ");

		

		String[][] phraseParsing = new String[testArr.length][3];
		
		for (int i = 0; i < testArr.length; i++) {
			String[] temp = testArr[i].split(", ");
			if (temp.length != 3) {
				System.out.println("Error in " + (i + 1) + " part of phrase");
			} else {
				phraseParsing[i] = temp;
				System.out.println(Arrays.toString(phraseParsing[i]));
			}
		} 
	}
}
