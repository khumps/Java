//~Deh

public class Healer extends Character{
	protected String item1, item2, item3, item4;
	
	public Healer(String name, String sex, String type, int blade, int magic, int lockpicking, int stealth, int armor, 
		int speech, int dodge, int dexterity, int crit_strike, int looter){
		super(name, sex, type);
		
		Stats thing = new Stats("DEF", 10);
		Skills thing2 = new Skills("magic", 35);
		
		item1 = "Healer's Staff";
		item2 = "Tome of Medicine";
		item3 = "Robes";
		item4 = "Health Potion";
	}
	
	public String toString(){
		String loadout = "\n" + item1 + ", " + item2 + ", " + item3 + ", " + item4 + "\n"; 
		return loadout;
	}
}