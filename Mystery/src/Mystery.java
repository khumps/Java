/* Figure out the functionality of this class.
 * Change the output to be meaningful.
 * Give the variables names appropriate to their usage.
 */

import java.util.Random;
import java.util.Scanner;

public class Mystery {
	public static void main(String[] args) {
		System.out.println("Welcome to ...\n");
		int a;
		int b = 1000; //never changes
		boolean playAgain = true;
		int input1;
		Scanner e = new Scanner(System.in);
		Random f = new Random((int)(Math.random()*100)); //creates random number between 0-100
		while(playAgain){
			a = f.nextInt(b+1); //a = random number with b+1 and f as seeds
			boolean correct = false;
			for(int i = 0; i < 10 && !correct; i++){
				do{
					System.out.println("Guess a number between 0 and " + b);
					input1 = e.nextInt();
					if(input1 < 0 || input1 > b)
						System.out.println("Y You So Stupid?");
				}while(input1 < 0 || input1 > b);
				if(input1 == a){
					System.out.println("You Got It!!");
					correct = true;
				}
				else{
					if(input1 < a)
						System.out.println("Guess Higher");	
					else
						System.out.println("Guess Lower");
				}
			}
			if(!correct){
				System.out.println("You Suck");
				System.out.println("The number was " + a);
			}
			System.out.println("Would you like to play again?");
			String answer;
			while( true ){
				answer = e.next();
				if( answer.equalsIgnoreCase("y")|| answer.equalsIgnoreCase("n"))
					break;
			}
			if(answer.equalsIgnoreCase("n"))
				playAgain = false;

		}
	}
}
