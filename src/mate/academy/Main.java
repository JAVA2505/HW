package mate.academy;

public class Main {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 3/2;
		System.out.println(a + b);
		
		ArrayListMode arrayA = new ArrayListMode();
		SoftDrink drinkA = new SoftDrink("A", "white");
		SoftDrink drinkB = new SoftDrink("B", "white");
		arrayA.add(drinkA);
		arrayA.add(drinkA);
		arrayA.add(drinkA);
		arrayA.add(drinkA);
		arrayA.add(3, drinkB);
		
		

	}

}
