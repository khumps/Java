//~Deh

public class Rogue extends Character{
	protected String item1, item2, item3, item4;
	
	public Rogue(String name, String sex, String type, int blade, int magic, int lockpicking, int stealth, int armor, 
		int speech, int dodge, int dexterity, int crit_strike, int looter){
		
		super(name, sex, type);
		
		Stats thing = new Stats("SPD", 10);
		Skills thing2 = new Skills("looter", 35);
		
		item1 = "Stiletto";
		item2 = "Lockpick";
		item3 = "Padded Boots";
		item4 = "Health Potion";
	}	
	
	public String toString(){
		String loadout = "\n" + item1 + ", " + item2 + ", " + item3 + ", " + item4 + "\n"; 
		return loadout;
	}
}