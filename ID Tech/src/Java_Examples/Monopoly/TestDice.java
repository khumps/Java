// Testing program for Dice.java
//~Deh

public class TestDice{
	public static void main(String[] args){
		int i = 0;
		Dice die = new Dice();
		
		while(i <= 100){
			//run roll1Die method and print 100 times
			System.out.println(die.roll1Die());
			//run roll2Dice method and print 100 times
			System.out.println(die.roll2Dice());
			i++;
		}
	}
}