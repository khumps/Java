//~Deh

public class Stats extends Character{
	public Stats(){
		super();
		HP = 5;
		STR = 5;
		CHR = 5;
		DEF = 5;
		LCK = 5;
		POW = 5; 
		SPD = 5;
	}
	
	public Stats(String name, int st){
		if(name.equals("HP"))
			this.HP = HP;
		else if(name.equals("STR"))
			this.STR = STR;
		else if(name.equals("CHR"))
			this.CHR = CHR;
		else if(name.equals("DEF"))
			this.DEF = DEF;
		else if(name.equals("LCK"))
			this.LCK = LCK;
		else if(name.equals("POW"))
			this.POW = POW;
		else if(name.equals("SPD"))
			this.SPD = SPD;
	}
}