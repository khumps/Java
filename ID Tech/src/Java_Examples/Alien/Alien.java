//~Deh

public class Alien{
	private int eyes, legs;
	private String cross1, cross2, diet;
	
	public Alien(){
	   diet = "muffins";
		cross1 = "manatee";
		cross2 = "dying beached narwhal";
		eyes = 343567;
		legs = 42;
	}
	
	public Alien(String diet){
		this();
		this.diet = diet;
	}
	
	public Alien(String cross1, String cross2){
		this();
		this.cross1 = cross1;
		this.cross2 = cross2;
	}
	
	public Alien(int eyes){
		this();
		this.eyes = eyes;
	}
	
	public Alien(int eyes, int legs){
		this();
		this.eyes = eyes;
		this.legs = legs;
	}
	
	public String toString(){
		String state = "A " + eyes + "-eyed, " + legs + "-legged alien that looks like a cross between a " +
			cross1 + " and a(n) " + cross2 + " is currently in your base, eating your " + diet + ".";
		return state;
	}
}