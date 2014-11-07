// This program gathers information needed to create a character in a game
// READ THE COMMENTS CAREFULLY WHEN DEBUGGING
// ~Deh

import java.util.*;

public class CreateChar 
{
	// All work is being done in the main
	public static void main(String [] args)
	{
		// set up some variables to use
		String name;
		int health;
		double gold;
		String weapon;
		char charClass;
		
		// create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Get the character name
		System.out.print("Enter a character name: ");
		name = input.nextLine();
		
		// convert the name to all upper case
		name = name.toUpperCase();
		
		// The name must have a vowel as the second letter
		char letter = name.charAt(1);
		if(!(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'))
		{
			System.out.println("Invalid name - default name assigned.");
			name = "WILLARD THE WEAK";
		}
		
		// get the weapon name
		System.out.print("Enter a weapon name: ");
		weapon = input.nextLine();
		weapon = weapon.toUpperCase();

		// the weapon must contain the word "Sword"
		if(weapon.indexOf("SWORD") == -1)
		{
			System.out.println("Invalid weapon name - default weapon assigned.");
			weapon = "A board with a nail in it";
		}
		
		// get the health value
		System.out.print("Enter a health value between 1 and 100: ");
		health = input.nextInt();

		// health must be between 1 and 100
		if(health < 1 && health > 100)
		{
			System.out.println("Invalid health value - default health assigned.");
			health = 10;
		}
		
		// get the amount of gold
		System.out.print("Enter an amount of gold between 0 and 1000: ");
		gold = input.nextInt();

		// gold amount must be between 0 and 1000
		if(gold < 0.0 || gold > 1000.0)
		{
			System.out.println("Invalid gold amount - you get nothing.");
			gold = 0.0;
		}
		
		input.nextLine();
		// get the class of the character
		System.out.print("Enter character class: H (human) or E (elf): ");
		charClass = input.nextLine().charAt(0);
		
		// list the character data
		System.out.println("\nCharacter Data:\n");
		System.out.println("Name:   " + name);
		System.out.println("Weapon: " + weapon);
		System.out.println("Health: " + health);
		System.out.println("Gold:   " + gold);
		System.out.print("Class:  ");
		switch(charClass)
		{
		 case 'H': System.out.println("Human");
		 			  break;
		 case 'E': System.out.println("Elf");
		 		     break;
		 default:  System.out.println("Unknown");
		}

	}
}