package mate.academy;

public class Main {

	public static void main(String[] args) {

		ArrayListMode arrayA = new ArrayListMode();
		SoftDrink drinkA = new SoftDrink("A", "white");
		SoftDrink drinkB = new SoftDrink("B", "white");
		arrayA.add(drinkA);
		arrayA.add(drinkB);
		arrayA.add(drinkA);
		arrayA.add(drinkB);
		arrayA.remove(2);
		
		
		

	}

}
