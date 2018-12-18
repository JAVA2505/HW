package mate.academy;

public class Perch extends Hero {

	public Perch() {
		super("Perch", 6 + (int) (Math.random() * ((10 - 6) + 1)), 3 + (int) (Math.random() * ((10 - 3) + 1)),
				7 + (int) (Math.random() * ((10 - 7) + 1)), 55 + (int) (Math.random() * ((80 - 55) + 1)),
				"Add 5 damage to Strike every third attack");

	}

}
