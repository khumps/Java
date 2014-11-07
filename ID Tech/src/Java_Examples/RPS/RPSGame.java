//~Deh

import java.util.*;

public class RPSGame
{
	public static void main(String [] args){
		System.out.println("Rock, paper, or scissors?");
		Scanner myScanner = new Scanner(System.in);
	   String action = myScanner.nextLine();
		
		RPSThrower myOpponent = new RPSThrower();
	  	int opponentMove = myOpponent.go();
		
		switch(opponentMove)
		{
			case RPSThrower.ROCK:
				if(action.equals("rock"))
					System.out.println("Draw! Rock v rock");
				else if(action.equals("paper"))
					System.out.println("Winner! Paper beats rock");
				else
					System.out.println("Loser! Rock beats scissors!");
				break;
			case RPSThrower.PAPER:
				if(action.equals("rock"))
					System.out.println("Loser! Paper beats rock");
				else if(action.equals("paper"))
					System.out.println("Draw! Paper v paper");
				else
					System.out.println("Winner! Scissors beat paper");
				break;
			case RPSThrower.SCISSORS:
				if(action.equals("rock"))
					System.out.println("Winner! Rock beats scissors");
				else if(action.equals("paper"))
					System.out.println("Loser! Scissors beat paper");
				else
					System.out.println("Draw! Scissors v Scissors");
				break;			
		}
	}
}