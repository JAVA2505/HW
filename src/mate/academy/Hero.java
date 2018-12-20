package mate.academy;

public class Hero {

	private String name = "";
	private String ultimateInfo = "Ultimate Info";
	private int agility;
	private int intelligence;
	private int strength;
	private int health;
	private boolean stun = false;
	private Item[] items = new Item[2];

	public Hero() {
	}

	public Hero(String name, int agility, int intelligence, int strength, int health, String ultimate, boolean stun) {

		this.name = name;
		this.agility = agility;
		this.intelligence = intelligence;
		this.strength = strength;
		this.health = health;
		this.ultimateInfo = ultimate;
		this.setStun(stun);

	}

	public void addItem(int slotNumber, Item item) {

		for (int i = 0; i < items.length; i++) {
			if (i == slotNumber - 1) {
				items[i] = item;
				agility = agility + items[i].getAgility();
				intelligence = intelligence + items[i].getIntelligence();
				strength = strength + items[i].getStrength();
				health = health + items[i].getHealth();
			}
		}

	}
	
	public void removeItem(int slotNumber) {

		for (int i = 0; i < items.length; i++) {
			if (i == slotNumber - 1) {
				agility = agility - items[i].getAgility();
				intelligence = intelligence - items[i].getIntelligence();
				strength = strength - items[i].getStrength();
				health = health - items[i].getHealth();
				items[i] = null;
			}
		}

	}
	
	

	public int strikeHero() {
		int strike = intelligence / 3 + agility / 2 + strength;
		return strike;
	}

	public int ultimateStrike() {
		int ultimate = 0;
		return ultimate;
	}

	public boolean ultimateStun() {
		boolean ultimate = true;
		return ultimate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUltimateInfo() {
		return ultimateInfo;
	}

	public void setUltimateInfo(String ultimateInfo) {
		this.ultimateInfo = ultimateInfo;
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

	public boolean isStun() {
		return stun;
	}

	public void setStun(boolean stun) {
		this.stun = stun;
	}

	@Override
	public String toString() {
		return "Hero " + name + "\n\nAgility " + agility + "\nIntelligence " + intelligence + "\nStrength " + strength
				+ "\nHealth " + health + "\nStrike " + strikeHero() + "\nUltimate: " + ultimateInfo + "\n\nSlot # 1 - "
				+ (items[0] == null ? " is empty" : items[0].toString()) + "\n\nSlot # 2 - "
				+ (items[1] == null ? " is empty" : items[1].toString());
	}

}
