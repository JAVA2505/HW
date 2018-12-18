package mate.academy;

public class Tadpole extends Hero {

	public Tadpole() {
		super("Tadpole", 5 + (int) (Math.random() * ((10 - 5) + 1)), 4 + (int) (Math.random() * ((9 - 4) + 1)),
				6 + (int) (Math.random() * ((10 - 6) + 1)), 60 + (int) (Math.random() * ((80 - 60) + 1)),
				"Add 5 damage to Strike every third attack");

	}

}
