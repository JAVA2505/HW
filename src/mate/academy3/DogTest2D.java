package mate.academy3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DogTest2D {

	public static void main(String[] args) {

		char dog = '@';
		char comma = ',';
		char aidBig = 'A';
		char aidSmall = 'a';
		char bombBig = 'B';
		char bombSmall = 'b';

		int dogHealth = 100;
		int positionAid;
		int positionBomb;

		int line = 0;
		int column = 0;

		int random;

		char[][] dogTest = new char[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				dogTest[i][j] = comma;
			}
		}

		for (int i = 0; i < dogTest.length; i++) {

			if (i == 0) {

				positionAid = (int) ((Math.random() * dogTest.length - 2) + 1);

				do {
					positionBomb = (int) ((Math.random() * dogTest.length - 2) + 1);
				} while (positionBomb == positionAid);

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionAid] = aidBig;
				} else {
					dogTest[i][positionAid] = aidSmall;
				}

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionBomb] = bombBig;
				} else {
					dogTest[i][positionBomb] = bombSmall;
				}

			} else {
				positionAid = (int) (Math.random() * dogTest.length - 1);

				do {
					positionBomb = (int) (Math.random() * dogTest.length - 1);
				} while (positionBomb == positionAid);

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionAid] = aidBig;
				} else {
					dogTest[i][positionAid] = aidSmall;
				}

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionBomb] = bombBig;
				} else {
					dogTest[i][positionBomb] = bombSmall;
				}
			}

		}

		dogTest[0][0] = dog;

		for (int i = 0; i < dogTest.length; i++) {
			System.out.println(Arrays.toString(dogTest[i]));

		}
		System.out.println("Health: " + dogHealth);

		Scanner sc = new Scanner(System.in);
		String controlCase;

		for (;;) {

			for (int i = 0; i < dogTest.length; i++) {
				for (int j = 0; j < dogTest.length; j++) {

					if (dogTest[i][j] == dog) {
						line = i;
						column = j;

					}
				}
			}

			controlCase = sc.nextLine();

			switch (controlCase) {

			case "d":

				if (column < 9) {

					dogHealth = dogHealth - 5;

					if (dogTest[line][column + 1] == aidBig) {
						dogHealth = dogHealth + 40;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line][column + 1] == aidSmall) {
						dogHealth = dogHealth + 20;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line][column + 1] == bombBig) {
						dogHealth = dogHealth - 40;
						if (dogHealth <= 0) {
							System.out.println("GAME OVER");
						}
					} else if (dogTest[line][column + 1] == bombSmall) {
						dogHealth = dogHealth - 20;
						if (dogHealth <= 0) {
							System.out.println("GAME OVER");
						}
					}

					dogTest[line][column + 1] = dog;
					dogTest[line][column] = comma;
				}

				break;

			case "a":

				if (column == 0) {
					dogHealth = dogHealth - 5;
				} else if (column > 0) {

					dogHealth = dogHealth - 5;

					if (dogTest[line][column - 1] == aidBig) {
						dogHealth = dogHealth + 40;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line][column - 1] == aidSmall) {
						dogHealth = dogHealth + 20;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line][column - 1] == bombBig) {
						dogHealth = dogHealth - 40;
						if (dogHealth <= 0) {
							System.out.println("GAME OVER");
						}
					} else if (dogTest[line][column - 1] == bombSmall) {
						dogHealth = dogHealth - 20;
						if (dogHealth <= 0) {
							System.out.println("GAME OVER");
						}
					}

					dogTest[line][column - 1] = dog;
					dogTest[line][column] = comma;
				}
				break;

			case "s":

				if (line < 9) {

					dogHealth = dogHealth - 5;

					if (dogTest[line + 1][column] == aidBig) {
						dogHealth = dogHealth + 40;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line + 1][column] == aidSmall) {
						dogHealth = dogHealth + 20;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line + 1][column] == bombBig) {
						dogHealth = dogHealth - 40;
						if (dogHealth <= 0) {
							System.out.println("GAME OVER");
						}
					} else if (dogTest[line + 1][column] == bombSmall) {
						dogHealth = dogHealth - 20;
						if (dogHealth <= 0) {
							System.out.println("GAME OVER");
						}
					}

					dogTest[line + 1][column] = dog;
					dogTest[line][column] = comma;

				}
				break;

			case "w":

				if (line > 0) {

					dogHealth = dogHealth - 5;

					if (dogTest[line - 1][column] == aidBig) {
						dogHealth = dogHealth + 40;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line - 1][column] == aidSmall) {
						dogHealth = dogHealth + 20;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line - 1][column] == bombBig) {
						dogHealth = dogHealth - 40;
						if (dogHealth <= 0) {
							System.out.println("GAME OVER");
						}
					} else if (dogTest[line - 1][column] == bombSmall) {
						dogHealth = dogHealth - 20;
						if (dogHealth <= 0) {
							System.out.println("GAME OVER");
						}
					}

					dogTest[line - 1][column] = dog;
					dogTest[line][column] = comma;
				}
				break;

			}

			if (dogHealth <= 0) {
				System.out.println("Health: " + dogHealth);
				System.out.println("GAME OVER");
				sc.close();
				break;
			}

			for (int i = 0; i < 10; i++) {
				System.out.println(Arrays.toString(dogTest[i]));
			}
			System.out.println("Health: " + dogHealth);
		}

	}

}
