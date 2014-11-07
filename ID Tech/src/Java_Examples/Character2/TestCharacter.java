//~Deh

import java.util.*;

public class TestCharacter{
	public static void main(String[] args){
		String name, sex, type;
	   int response, blade, magic, lockpicking, stealth, armor, speech, dodge, dexterity, crit_strike, looter;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name?");
		name = scan.nextLine();
		
		System.out.println("Male/Female?");
		sex = scan.nextLine();
		System.out.println("Predefined class (1), or create your own(2)?");
		response = scan.nextInt();
		
		scan.nextLine();
		
		if(response == 1){
			System.out.println("Warrior, Wizard, Rogue, Healer, or Archer?");
			type = scan.nextLine();

			Character player = new Character(name, sex, type);
			System.out.println(player.toString());
		}
		else{
			System.out.println("What will you call this class?");
			type = scan.nextLine();
			
			System.out.println("Blade skill?");
			blade = scan.nextInt();
			
			System.out.println("Magic skill?");
			magic = scan.nextInt();
			
			System.out.println("Lockpicking skill?");
			lockpicking = scan.nextInt();
			
			System.out.println("Stealth skill?");
			stealth = scan.nextInt();
			
			System.out.println("Armor skill?");
			armor = scan.nextInt();
			
			System.out.println("Speech skill?");
			speech = scan.nextInt();
			
			System.out.println("Dodge skill?");
			dodge = scan.nextInt();
			
			System.out.println("Dexterity skill?");
			dexterity = scan.nextInt();
			
			System.out.println("Crit Strike skill?");
			crit_strike = scan.nextInt();
			
			System.out.println("Looter skill?");
			looter = scan.nextInt();
			
			Character player = new Character(name, sex, type, blade, magic, lockpicking, stealth, armor, speech, dodge, dexterity, 
				crit_strike, looter);
			System.out.println(player.toString());
		}
		
		Character player2 = new Character("Jiff", "Male", "Archer");
		System.out.println(player2.toString());
		Character player3 = new Character("Sorn", "Female", "Healer");
		System.out.println(player3.toString());
	}
}