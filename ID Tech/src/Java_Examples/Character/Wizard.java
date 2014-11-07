//~Deh

public class Wizard extends Character{
	protected String item1, item2, item3, item4;
	
	public Wizard(String name, String sex, String type, int blade, int magic, int lockpicking, int stealth, int armor, 
		int speech, int dodge, int dexterity, int crit_strike, int looter){
		super(name, sex, type);
		
		Stats thing = new Stats("LCK", 10);
		Skills thing2 = new Skills("magic", 35);
		
		item1 = "Wizard's Staff";
		item2 = "Necronomicon";
		item3 = "Robes";
		item4 = "Health Potion";
	}
	
	public String toString(){
		String loadout = "\n" + item1 + ", " + item2 + ", " + item3 + ", " + item4 + "\n"; 
		return loadout;
	}
}