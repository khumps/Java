//~Deh

public class Skills extends Character{
   protected int blade, magic, lockpicking, stealth, armor, speech, dodge, dexterity, crit_strike, looter;
  
	public Skills(){
		blade = 10;
		magic = 10;
		lockpicking = 10;
		stealth = 10;
		armor = 10;
		speech = 10;
		dodge = 10;
		dexterity = 10;
		crit_strike = 10;
		looter = 10;
	}
	
	public Skills(String thing, int sk){
		this();
		if(thing.equals("blade"))
			blade = sk;
		if(thing.equals("magic"))
			magic = sk;
		if(thing.equals("lockpicking"))
			lockpicking = sk;
		if(thing.equals("stealth"))
			stealth = sk;
		if(thing.equals("armor"))
			armor = sk;
		if(thing.equals("speech"))
			speech = sk;
		if(thing.equals("dodge"))
			dodge = sk;
		if(thing.equals("dexterity"))
			dexterity = sk;
		if(thing.equals("crit_strike"))
			crit_strike = sk;
		if(thing.equals("looter"))
			looter = sk;
	}
	
	public Skills(int blade, int magic, int lockpicking, int stealth, int armor, int speech, int dodge, 
		int dexterity, int crit_strike, int looter){
		
		this();
		
		if(blade > 0 && blade < 99)
			this.blade = blade;
		if(magic > 0 && magic < 99)
			this.magic = magic;
		if(lockpicking > 0 && lockpicking < 99)
			this.lockpicking = lockpicking;
		if(stealth > 0 && stealth < 99)
			this.stealth = stealth;
		if(armor > 0 && armor < 99)
			this.armor = armor;
		if(speech > 0 && speech < 99)
			this.speech = speech;
		if(dodge > 0 && dodge < 99)
			this.dodge = dodge;
		if(dexterity > 0 && dexterity < 99)
			this.dexterity = dexterity;
		if(crit_strike > 0 && crit_strike < 99)
			this.crit_strike = crit_strike;
		if(looter > 0 && looter < 99)
			this.looter = looter;
	}
	
	public String toString(){
		String skills = "\nSkills:\nBlade - " + blade + "\nMagic - " + magic + "\nLockpicking - " + lockpicking + "\nStealth - " +
			"\nArmor - " + armor + "\nSpeech - " + speech + "\nDodge - " + dodge + "\nDexterity - " +  dexterity + 
			"\nCrit Strike - " + crit_strike + "\nLooter - " + looter;
		return skills;
	}
}