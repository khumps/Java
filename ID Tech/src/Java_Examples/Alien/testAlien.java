//~Deh

public class testAlien{
	public static void main(String[] args){
		Alien meep = new Alien("muffins");
		Alien meep2 = new Alien("manatee", "dying beached narwhal");
		Alien meep3 = new Alien(343567, 42);

		System.out.println(meep.toString());
		System.out.println(meep2.toString());
		System.out.println(meep3.toString());
	}
}