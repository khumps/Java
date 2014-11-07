//Dice program for Monopoly
//Rolls dice
//~Deh

import java.util.*;

public class Dice{
	int die = 0, a = 0, b = 0, rolls = 0;
	
	public int roll1Die(){
		//Creates a ranomized dice roll
		die = (int)(6 * Math.random()) + 1;
		return die;
	}
	
	public int roll2Dice(){
		//add the two random rolls together
		//although system time is never really random
		a = roll1Die();
		b = roll1Die();
		rolls = a + b;
		return rolls;
	}
}