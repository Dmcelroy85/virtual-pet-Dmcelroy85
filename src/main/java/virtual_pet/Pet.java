package virtual_pet;

public class Pet {

	private String name;
	private int hunger;
	private int thirst;
	private int waste;
	private int boredom;
	private int fatigue;

	public Pet(String name, int hunger, int thirst, int waste, int boredom, int fatigue) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
		this.fatigue = fatigue;
	}

	// Setter
	public void setName(String nameChoice) {
		name = nameChoice;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getFatigue() {
		return fatigue;
	}

	// Instance variable threshold checks
	public boolean checkHungry() {
		if (hunger >= 5) {
			return true;

		} else {
			return false;
		}
	}

	public boolean checkThirsty() {
		if (thirst >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkPottyTime() {
		if (waste >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkBored() {
		if (boredom >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkSleepy() {
		if (fatigue >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkDead() {
		if (hunger > 20 || thirst > 20 || waste > 20 || boredom > 20 || fatigue > 20) {
			return true;
		} else {
			return false;
		}
	}

	// Activity Methods (effect instance variables)
	public void feed() {
		if (hunger >= 5) {
			hunger -= 5;
		} else {
			hunger = 0;
		}

	}

	public void giveWater() {
		if (thirst >= 5) {
			thirst -= 5;
		} else {
			thirst = 0;
		}
	}

	public void takeOutside() {
		if (waste >= 5) {
			waste -= 5;
		} else {
			waste = 0;
		}
	}

	public void play() {
		if (boredom >= 5) {
			boredom -= 5;
		} else {
			boredom = 0;
		}
	}

	public void letSleep() {
		if (fatigue >= 5) {
			fatigue -= 5;
		} else {
			fatigue = 0;
		}
	}

	public void tick() {
		hunger += 1;
		thirst += 1;
		waste += 1;
		boredom += 1;
		fatigue += 1;
	}

}