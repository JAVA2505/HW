package mate.academy;

public class Main {

	public static void main(String[] args) {

		Hero tadpol = new Tadpole();
		Hero tadpol1 = new Tadpole();

		System.out.println(tadpol.toString());
		System.out.println(tadpol.getHealth());

		Hero[] fighting = { tadpol, tadpol1 };

		boolean gameOver = true;

		while (gameOver) {

			for (int i = 0; i < 2; i++) {

				switch (i) {

				case 0:
					
					if(fighting[i + 1].getHealth() <= 0 || fighting[i].getHealth() <= 0) {
						gameOver = false;
						break;
					}
					//gameOver = fighting[i + 1].getHealth() <= 0 ? false : true;
					System.out.println(
							"Attacking hero " + fighting[i].getName() + " - Stricke is " + fighting[i].strikeHero());
					fighting[i + 1].setHealth(fighting[i + 1].getHealth() - fighting[i].strikeHero());

					System.out.println(
							"Health of hero " + fighting[i + 1].getName() + " is " + fighting[i + 1].getHealth());
				
					break;

				case 1:
					if(fighting[i - 1].getHealth() <= 0 || fighting[i].getHealth() <= 0) {
						gameOver = false;
						break;
					}
					
					//gameOver = fighting[i - 1].getHealth() <= 0 ? false : true;
					System.out.println(
							
							"Attacking hero " + fighting[i].getName() + " - Stricke is " + fighting[i].strikeHero());
					fighting[i - 1].setHealth(fighting[i - 1].getHealth() - fighting[i].strikeHero());

					System.out.println(
							"Health of hero " + fighting[i - 1].getName() + " is " + fighting[i - 1].getHealth());

					break;
				}

			}

		}
	}
}
