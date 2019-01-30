
package mate.academy;

public class RandomColour {
	
	public static String getRandomColore() {
		
		String[] arr = {"White", "Black", "Red", "Green", "Yellow", "Brown"};
		return arr[(int)(Math.random()*arr.length)];
		
	}
}