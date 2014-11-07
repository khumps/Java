//~Deh

public class testShip{
	public static void main(String[] args){
		String shipClass, name, natl;
		int hitRating, points;
		int airStrike, gun, missile, airRating, damage;
		boolean sink = false;
		
		Ship imOnABoat = new Ship();
		
		shipClass = "Helicopter Carrier(CVHG)";
		name = "Baku";
		natl = "Communist";
		hitRating = 9;
		points = 15;
		airStrike = 1;
		gun = 1;
		missile = 2;
		airRating = 2;
		damage = 2;
		
		imOnABoat.Ship(shipClass, name, natl, hitRating, points, airStrike, gun, missile, airRating, damage);
		imOnABoat.setValues();
		System.out.println(imOnABoat.toString());
		
		shipClass = "TACO";
		name = "Andrew Ryan's Ghost";
		natl = "???";
		hitRating = 9001;
		points = 42;
		airStrike = 2;
		gun = 1;
		missile = 2;
		airRating = 13;
		damage = 1;
		
		imOnABoat.Ship(shipClass, name, natl, hitRating, points, airStrike, gun, missile, airRating, damage);
		imOnABoat.setValues();
		System.out.println(imOnABoat.toString());
	}
}