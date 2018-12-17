package mate.academy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String number;
		int counter = 0;

		Shape[] shapeFactory = new Shape[5];

		for (;;) {

			System.out.println("Select type of shape: " + "\n" + "1 - Square" + "\n" + "2 - Equilateral Triangle" + "\n"
					+ "3 - Circle");

			Scanner in = new Scanner(System.in);
			number = in.nextLine();

			switch (number) {

			case "1":
				System.out.println("you have chosen a Square, enter a side: ");
				int sideSq = in.nextInt();
				shapeFactory[counter] = new Square("white", "S", sideSq);
				shapeFactory[counter].countPerimeter();
				shapeFactory[counter].countArea();
				//shapeFactory[counter].getInfo();

				counter++;
				break;

			case "2":
				System.out.println("you have chosen a Equilateral Triangle, enter a side: ");
				int sideTr = in.nextInt();
				shapeFactory[counter] = new EquilateralTriangle("white", "T", sideTr);
				shapeFactory[counter].countPerimeter();
				shapeFactory[counter].countArea();
				//shapeFactory[counter].getInfo();

				counter++;
				break;

			case "3":
				System.out.println("you have chosen a Circle, enter a radius: ");
				int radius = in.nextInt();
				shapeFactory[counter] = new Circle("wite", "C", radius);
				shapeFactory[counter].countPerimeter();
				shapeFactory[counter].countArea();
				//shapeFactory[counter].getInfo();

				counter++;
				break;

			}

			if (counter == 5) {
				break;
			}
		}

		System.out.println("Shape Factory: " + "\n");
		for (int i = 0; i < shapeFactory.length; i++) {
			if (shapeFactory[i] != null) {
				shapeFactory[i].getInfo();

			}
		}
	}
}
