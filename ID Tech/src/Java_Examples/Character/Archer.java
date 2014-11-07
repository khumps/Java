//~Deh

public class Archer extends Character{
	protected String item1, item2, item3, item4;
	
	public Archer(String name, String sex, String type, int blade, int magic, int lockpicking, int stealth, int armor, 
		int speech, int dodge, int dexterity, int crit_strike, int looter){
		super(name, sex, type);
		
		Stats thing = new Stats("SPD", 10);
		Skills thing2 = new Skills("dexterity", 35);
		
		item1 = "Composite Bow";
		item2 = "Leather Armor";
		item3 = "Boots";
		item4 = "Health Potion";
	}
	
	public String toString(){
		String loadout = "\n" + item1 + ", " + item2 + ", " + item3 + ", " + item4 + "\n"; 
		return loadout;
	}
}