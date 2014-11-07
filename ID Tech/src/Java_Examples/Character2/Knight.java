//~Deh

public class Knight extends Warrior{
	protected String item1, item2, item3, item4;
	
	public Knight(/*String name, String sex, String type, int blade, int magic, int lockpicking, int stealth, int armor, int speech, int dodge, int dexterity, int crit_strike, int looter*/){
		super();
		
		Stats thing = new Stats("STR", 15);
		Skills thing2 = new Skills("blade", 40);
		
		item1 = "Sword";
		item2 = "Plate Mail";
		item3 = "Boots";
		item4 = "Health Potion";
	}	
	
	public String toString(){
		String loadout = "\n" + item1 + ", " + item2 + ", " + item3 + ", " + item4 + "\n"; 
		return loadout;
	}
}