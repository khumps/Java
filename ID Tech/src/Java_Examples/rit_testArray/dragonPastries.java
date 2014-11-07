//~Deh

public class dragonPastries
{
	private int health = 9001;
	
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int h)
	{
		if(h >= 9000)
		{
			health = 0;
		}
		else
			health = 8999;
	}
	
	protected String moldiness = "Fresh";
	
	protected String creamFilling = "pumpkin & Piccolo";
	
	public dragonPastries(int health)
	{
		this.health = health;
	}
	
	public dragonPastries()
	{
		//do not need to change anything
	}
	
	public String willMakeYouSick()
	{
		switch(health)
		{
			case 1:
				return "Cant believe youre not butter!!";
			case 9001:
				return "DBZ OMG!!!";
			default:
				return "You are dying of the plague!!!";
		}
	}
	
	public String toString()
	{
		return "Health: " + health + " \nFreshness: " + moldiness + " \nFilling: " + creamFilling + "\nThe pastry ate you!!!"; 
	}
}