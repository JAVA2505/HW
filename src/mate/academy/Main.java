package mate.academy;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Hero tadpol = new Tadpole();
		Hero perch = new Perch();

		System.out.println(tadpol.toString());
		System.out.println("\n        VS        \n");
		System.out.println(perch.toString());
		System.out.println("\n        FIGHT!!!!!!!       \n");
		

		Hero[] fighting = { tadpol, perch };

		boolean gameOver = true;
		int moveNumber = 1;

		while (gameOver) {

			for (int i = 0; i < 2; i++) {

				switch (i) {

				case 0:

					if (fighting[i + 1].getHealth() <= 0 || fighting[i].getHealth() <= 0) {
						gameOver = false;
						break;
					}

					// gameOver = fighting[i + 1].getHealth() <= 0 ? false : true;

					Thread.sleep(1000);
					System.out.println("-----------------------\n");
					System.out.println("Move " + moveNumber);

					System.out.println(
							"Attacking hero " + fighting[i].getName() + " - Stricke is " + fighting[i].strikeHero());
					fighting[i + 1].setHealth(fighting[i + 1].getHealth() - fighting[i].strikeHero());

					System.out.println(
							"Health of hero " + fighting[i + 1].getName() + " is " + fighting[i + 1].getHealth() + "\n");

					break;

				case 1:
					if (fighting[i - 1].getHealth() <= 0 || fighting[i].getHealth() <= 0) {
						gameOver = false;
						break;
					}

					// gameOver = fighting[i - 1].getHealth() <= 0 ? false : true;
					
					Thread.sleep(1000);
					System.out.println("-----------------------\n");
					System.out.println("Move " + moveNumber);

					System.out.println(

							"Attacking hero " + fighting[i].getName() + " - Stricke is " + fighting[i].strikeHero());
					fighting[i - 1].setHealth(fighting[i - 1].getHealth() - fighting[i].strikeHero());

					System.out.println(
							"Health of hero " + fighting[i - 1].getName() + " is " + fighting[i - 1].getHealth() + "\n");

					break;
				}
				moveNumber++;

			}

		}
	}
}
