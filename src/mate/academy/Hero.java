package mate.academy;

public class Hero {

	private String name = "";
	private String ultimateInfo = "Ultimate Info";
	private int agility;
	private int intelligence;
	private int strength;
	private int health;

	public Hero() {
	}

	public Hero(String name, int agility, int intelligence, int strength, int health, String ultimate) {

		this.name = name;
		this.agility = agility;
		this.intelligence = intelligence;
		this.strength = strength;
		this.health = health;
		this.ultimateInfo = ultimate;
	}

	public int strikeHero() {
		int strike = intelligence / 3 + agility / 2 + strength;
		return strike;
	}

	public int ultimateHero() {
		int ultimate = 0;
		return ultimate;	
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Hero " + name + "\n\nAgility " + agility + "\nIntelligence " + intelligence + "\nStrength "
				+ strength + "\nHealth " + health + "\nStrike " + strikeHero() + "\nUltimate: " + ultimateInfo;
	}
	
	
}
