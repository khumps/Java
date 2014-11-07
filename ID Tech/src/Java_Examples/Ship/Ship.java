//~Deh

public class Ship{
	private String shipClass, name, natl;
	private int hitRating, points;
	private int airStrike, gun, missile, airRating, damage;
	private boolean sink = false;
	
	public void Ship(String shipClass, String name, String natl, int hitRating, int points, int airStrike, int gun, int missile,
	int airRating, int damage){
		this.shipClass = shipClass;
		this.name = name;
		this.natl = natl;
		this.hitRating = hitRating;
		this.points = points;
		this.airStrike = airStrike;
		this.gun = gun;
		this.missile = missile;
		this.airRating = airRating;
		this.damage = damage;
	}

	public void setValues(){
		if(damage > hitRating){
			sink = true;
		}
		
		if(damage > 0 && damage < 2)
			airStrike = 0;
		else if(damage >= 2)
			gun = 0;
	}
	
	public String toString(){
		String ship = "";
		ship = "Name: " + name + "\nShip class: " +shipClass + "\nNationality: " + natl  + 
		"\nHit Rating: " + hitRating  + "\nPoint Value: " + points  + "\nAir Strike: " +
		airStrike + "\nGun Platform: " + gun + "\nMissile Platforms: " +	missile + 
		"\nAir Defense Rating: " + airRating + "\nDamage: " + damage  + "\n";
		return ship;
	}
}