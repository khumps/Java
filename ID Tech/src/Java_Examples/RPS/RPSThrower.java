//~Deh

import java.util.Random;

public class RPSThrower
{
	public static Random randomizer = new Random();
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSORS = 2;
	
	public int go()
	{
		return randomizer.nextInt(3);
	}
}
