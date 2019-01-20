package mate.academy;

public class Main {

	public static void main(String[] args) {

		ArrayListMode arrayA = new ArrayListMode();
		SoftDrink drinkA = new SoftDrink("A", "white");
		SoftDrink drinkB = new SoftDrink("B", "white");
		SoftDrink drinkC = new SoftDrink("C", "white");
		SoftDrink drinkD = new SoftDrink("D", "white");
		arrayA.add(drinkB);
		arrayA.add(drinkA);
		arrayA.add(drinkD);
		arrayA.add(drinkC);
		System.out.println(arrayA.toString());
		arrayA.remove(drinkB);
		System.out.println(arrayA.toString());
		arrayA.sortDrink();
		System.out.println(arrayA.toString());
		
		
		

	}

}
