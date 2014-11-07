//~Deh

import java.util.*;

public class Character{

	protected int blade, magic, lockpicking, stealth, armor, speech, dodge, dexterity, crit_strike, looter;
	protected String name, sex, type, stat, loadout;
	
	protected int health = 100;
	
	protected int HP, STR, CHR, DEF, LCK, POW, SPD;
	
	public Character(){
		
	}
	
	public Character(String name, String sex, String type){		
		this.name = name;
		this.sex = sex;
		this.type = type;
		
		if(type.equals("Wizard")){
			Wizard item = new Wizard(name, sex, type, blade, magic, lockpicking, stealth, armor,  speech, dodge, dexterity, crit_strike, looter);
			loadout = item.toString();
		}
		else if(type.equals("Warrior")){
			Warrior item = new Warrior(name, sex, type, blade, magic, lockpicking, stealth, armor,  speech, dodge, dexterity, crit_strike, looter);
			loadout = item.toString();
		}
		else if(type.equals("Knight")){
			Knight item = new Knight(/*name, sex, type, blade, magic, lockpicking, stealth, armor,  speech, dodge, dexterity, crit_strike, looter*/);
			loadout = item.toString();
		}
		
		Skills player = new Skills();
		stat = player.toString();
	}
	
	public Character(String name, String sex, String type, int blade, int magic, int lockpicking, int stealth, int armor, 
		int speech, int dodge, int dexterity, int crit_strike, int looter){
		
		this();		
		this.name = name;
		this.sex = sex;
		this.type = type;
		this.blade = blade;
		this.magic = magic;
		this.lockpicking = lockpicking;
		this.stealth = stealth;
		this.armor = armor;
		this.speech = speech;
		this.dodge = dodge;
		this.dexterity = dexterity;
		this.crit_strike = crit_strike;
		this.looter = looter;
		
		Skills player = new Skills(blade, magic, lockpicking, stealth, armor, speech, dodge, dexterity, crit_strike, looter);
		stat = player.toString();
		
		System.out.println("Which loadout would you prefer: Wizard, Warrior, Rogue, Healer, or Archer?");
		Scanner scan = new Scanner(System.in);
		String load = scan.nextLine();
		
		if(load.equals("Wizard")){
			Wizard item = new Wizard(name, sex, type, blade, magic, lockpicking, stealth, armor,  speech, dodge, dexterity, crit_strike, looter);
			loadout = item.toString();
		}
		else if(load.equals("Warrior")){
			Warrior item = new Warrior(name, sex, type, blade, magic, lockpicking, stealth, armor,  speech, dodge, dexterity, crit_strike, looter);
			loadout = item.toString();
		}
		else if(load.equals("Knight")){
			Knight item = new Knight(/*name, sex, type, blade, magic, lockpicking, stealth, armor,  speech, dodge, dexterity, crit_strike, looter*/);
			loadout = item.toString();
		}
	}
	
	public int attack(Character target){
		int att = (int)(100 * Math.random()) + 1;
		int damage = 0;
		
		if(att >= 1 && att <= 25){
			damage = 0;
		}
		else if(att >= 26 && att <= 45){
			damage = (int)(5 * Math.random()) + 1;
		}
		else if(att >= 46 && att <= 65){
			damage = (int)(5 * Math.random()) + 6;
		}
		else if(att >= 66 && att <= 85){
			damage = (int)(5 * Math.random()) + 11;
		}
		else if(att >= 86 && att <= 100){
			damage = (int)(5 * Math.random()) + 16;
		}
		return damage;
	}
	
	public void changeHealth(int incHealth){
		health += incHealth;
		if(health < 0)
			health = 0;
		else if(health > 100)
			health = 100;
	}
	
	public int takeDamage(int damage){
		health = health - damage;
		
		if(health < 0)
			health = 0;
			
		return health;
	}
	
	public boolean isDead(){
		if(health <= 0)
			return true;
		return false;
	}
	
	public String toString(){
		String list = "Name: " + name + "\nClass: " + type + stat + loadout;
		return list;
	}
}
