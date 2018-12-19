package mate.academy;


public class Perch extends Hero {

	public Perch() {
		super("Perch", 6 + (int) (Math.random() * ((10 - 6) + 1)), 3 + (int) (Math.random() * ((10 - 3) + 1)),
				7 + (int) (Math.random() * ((10 - 7) + 1)), 70 + (int) (Math.random() * ((110 - 70) + 1)),
				"Stun Hero on one move", false);

	}

	@Override
	public boolean ultimateStun() {
		System.out.println(super.getName() + super.getUltimateInfo());
		return super.ultimateStun();
	}

}
