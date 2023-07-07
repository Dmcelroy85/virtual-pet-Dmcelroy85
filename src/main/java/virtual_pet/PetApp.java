package virtual_pet;

import java.util.Scanner;

public class PetApp {

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Pet kirby = new Pet(null, 5, 18, 5, 5, 5);

    System.out.println("<(^.^)>");
		System.out.println("Welcome to Forgotten Land! Home of Kirby!");
        System.out.println("Looks like there is a new born Kirby!");
		System.out.println("Cute, isn't he? Let's give him a name.");
		String nameChoice = input.nextLine();
		kirby.setName(nameChoice.substring(0, 1).toUpperCase() + nameChoice.substring(1).toLowerCase());

		System.out.println(kirby.getName() + ": \"Woof!\"");
		System.out.println("I think he likes it. :)");
		System.out.println("It's your job to take care of " + kirby.getName() + "."
				+ "\nMake sure he doesn't get too hungry, thirsty, bored, or tired.");
		boolean gameActive = true;

		while (gameActive) {

			if (kirby.checkDead()) {
				System.out.println(
                    "(>*-*)>  " + kirby.getName() + " has died.  <(*-*<)\n         ~~Game Over~~");
				gameActive = false;
				System.exit(0);
			}

			if (kirby.checkHungry()) {
				System.out.println("-" + kirby.getName() + " is hungry.");
			}
			if (kirby.checkThirsty()) {
				System.out.println("-" + kirby.getName() + " is thirsty.");
			}
			if (kirby.checkPottyTime()) {
				System.out.println("-" + kirby.getName() + " needs to potty.");
			}
			if (kirby.checkBored()) {
				System.out.println("-" + kirby.getName() + " is bored.");
			}
			if (kirby.checkSleepy()) {
				System.out.println("-" + kirby.getName() + " is sleepy.");
			}

            System.out.println("-----------------------------------");
			System.out.println("*Press [1] Feed " + kirby.getName() + ".");
			System.out.println("*Press [2] Give " + kirby.getName() + " some water.");
			System.out.println("*Press [3] Play with " + kirby.getName() + ".");
			System.out.println("*Press [4] Llet " + kirby.getName() + " sleep.");
			System.out.println("*Press [5] Take " + kirby.getName() + " out to potty.");
			System.out.println("*Press [6] Do nothing.");
			System.out.println("*Press [7] Exit the game.");
			String choice = input.next();

			if (choice.contains("1")) {
				kirby.feed();
			} else if (choice.contains("2")) {
				kirby.giveWater();
			} else if (choice.contains("3")) {
				kirby.play();
			} else if (choice.contains("4")) {
				kirby.letSleep();
			} else if (choice.contains("5")) {
				kirby.takeOutside();
			} else if (choice.contains("6")) {
				System.out.println("But but... <('-'<)");
			} else if (choice.contains("7")) {
				gameActive = false;
			} else {
				System.out.println("That's not an option.");
			}

			kirby.tick();

		}
		input.close();
	}

}