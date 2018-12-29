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
				try {
					shapeFactory[counter] = new Square(RandomColour.getRandomColore(), "S", sideSq);
				} catch (IllegalArgumentException e) {
					System.out.println("You entered size of side <= 0. Try again!!!!");
					break;
				}
				shapeFactory[counter].countPerimeter();
				shapeFactory[counter].countArea();
				// shapeFactory[counter].getInfo();

				counter++;
				break;

			case "2":
				System.out.println("you have chosen a Equilateral Triangle, enter a side: ");
				int sideTr = in.nextInt();
				try {
					shapeFactory[counter] = new EquilateralTriangle(RandomColour.getRandomColore(), "T", sideTr);
				} catch (IllegalArgumentException e) {
					System.out.println("You entered size of side <= 0. Try again!!!!");
					break;
				}

				shapeFactory[counter].countPerimeter();
				shapeFactory[counter].countArea();
				// shapeFactory[counter].getInfo();

				counter++;
				break;

			case "3":
				System.out.println("you have chosen a Circle, enter a radius: ");
				int radius = in.nextInt();
				try {
					shapeFactory[counter] = new Circle(RandomColour.getRandomColore(), "C", radius);
				} catch (IllegalArgumentException e) {
					System.out.println("You entered size of radius <= 0. Try again!!!!");
					break;
				}

				shapeFactory[counter].countPerimeter();
				shapeFactory[counter].countArea();
				// shapeFactory[counter].getInfo();

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