package mate.academy;

public class Item {

	private String name;
	private int agility;
	private int intelligence;
	private int strength;
	private int health;

	public Item() {

	}

	public Item(String name, int agility, int intelligence, int strength, int health) {
		this.name = name;
		this.agility = agility;
		this.intelligence = intelligence;
		this.strength = strength;
		this.health = health;
	}

	@Override
	public String toString() {

		return  name + "\nAgility " + agility + "\nIntelligence " + intelligence + "\nStrength " + strength
						+ "\nHealth " + health;
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

}
