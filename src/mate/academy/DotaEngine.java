package mate.academy;

public class DotaEngine {

	public static void startGame () throws InterruptedException {
		
		Hero tadpol = new Tadpole();
		Hero perch = new Perch();
		Item item1 = new Item("A", 2, 14, 2, 20);
		Item item2 = new Item("B", 2, 4, 2, 20);
		Item item3 = new Item("C", 2, 1, 2, 20);
		Item item4 = new Item("C", 2, 0, 2, 20);
		Item item5 = new Item("E", 2, 3, 2, 20);
		
		Store store = new Store();
		store.addAndSortItems(item1);
		store.addAndSortItems(item2);
		store.addAndSortItems(item3);
		store.addAndSortItems(item4);
		store.addAndSortItems(item5);
		for (Item item: store) {
			System.out.println("- " + item.getIntelligence());	
		}
		store.removeItem(item3.getName());
		
		for (Item item: store) {
			System.out.println("- " + item.getName());	
		}
		tadpol.addItem(1, item1);
		tadpol.removeItem(1);
		tadpol.addItem(2, item1);
		perch.addItem(2, item2);


		System.out.println(tadpol.toString());
		System.out.println("\n        VS        \n");
		System.out.println(perch.toString());
		System.out.println("\n        FIGHT!!!!!!!       \n");

		Hero[] fighting = { tadpol, perch };

		boolean gameOver = true;
		int moveNumber = 1;
		int counterHero1 = 0;
		int counterHero2 = 0;

		while (gameOver) {

			for (int i = 0; i < 2; i++) {

				switch (i) {

				case 0:

					if (fighting[i + 1].getHealth() <= 0 || fighting[i].getHealth() <= 0) {
						System.out.println(fighting[i].getName() + " won");
						gameOver = false;
						break;
					}

					Thread.sleep(1000);
					System.out.println("-----------------------\n");
					System.out.println("Move " + moveNumber);

					counterHero1++;

					if (fighting[i].isStun()) {
						System.out.println("Hero " + fighting[i].getName() + " is in stun on this move");
						break;

					} else if (counterHero1 == 3) {

						System.out.println("Attacking hero is " + fighting[i].getName() + " - Stricke with ultimate is "
								+ fighting[i].ultimateStrike());
						fighting[i + 1].setHealth(fighting[i + 1].getHealth() - fighting[i].ultimateStrike());

						System.out.println("Health of hero " + fighting[i + 1].getName() + " is "
								+ fighting[i + 1].getHealth() + "\n");
						counterHero1 = 0;
						break;

					} else {
						System.out.println("Attacking hero is " + fighting[i].getName() + " - Stricke is "
								+ fighting[i].strikeHero());
						fighting[i + 1].setHealth(fighting[i + 1].getHealth() - fighting[i].strikeHero());

						System.out.println("Health of hero " + fighting[i + 1].getName() + " is "
								+ fighting[i + 1].getHealth() + "\n");

						break;
					}

				case 1:
					if (fighting[i - 1].getHealth() <= 0 || fighting[i].getHealth() <= 0) {
						System.out.println(fighting[i].getName() + " won");
						gameOver = false;
						break;
					}

					Thread.sleep(1000);
					System.out.println("-----------------------\n");
					System.out.println("Move " + moveNumber);

					counterHero2++;

					if (fighting[i].isStun()) {
						break;

					} else if (counterHero2 == 3) {
						System.out.println(

								"Attacking hero is " + fighting[i].getName() + " - Stricke with ultimate is "
										+ fighting[i].strikeHero() + "; " + fighting[i - 1].getName()
										+ " is in stun on one move");
						fighting[i - 1].setHealth(fighting[i - 1].getHealth() - fighting[i].strikeHero());
						fighting[i - 1].setStun(true);

						System.out.println("Health of hero " + fighting[i - 1].getName() + " is "
								+ fighting[i - 1].getHealth() + "\n");

						counterHero2 = 0;
						break;

					} else {

						System.out.println(

								"Attacking hero is " + fighting[i].getName() + " - Stricke is "
										+ fighting[i].strikeHero());
						fighting[i - 1].setHealth(fighting[i - 1].getHealth() - fighting[i].strikeHero());
						fighting[i - 1].setStun(false);

						System.out.println("Health of hero " + fighting[i - 1].getName() + " is "
								+ fighting[i - 1].getHealth() + "\n");

						break;
					}
				}
				moveNumber++;

			}

		}	
	}
	
}
