//~Deh

import java.util.*;

public class TestMage{

	public static Random rng = new Random();
	
	public static void main(String[] args){
		if(args.length < 1){
			System.out.println("Must enter number of orcs.");
			return;
		}
		
		Mage mage = new Mage(5);
		int[] orcHP = new int[Integer.parseInt(args[0])];
		for(int i = 0; i < orcHP.length; i++){
			orcHP = (rng.nextInt(8) + 1) * 5;
		}
		boolean allDead = false;
		do{
			System.out.print("Orc HP:");
			for(int hp: orcHP){
				System.out.print(hp + " ");
			}
			System.out.println("");
			System.out.println("Fireball!");
			allDead = mage.fireball(orcHP);
		}while(allDead);
		System.out.println("The orcs are no more.");
	}
}