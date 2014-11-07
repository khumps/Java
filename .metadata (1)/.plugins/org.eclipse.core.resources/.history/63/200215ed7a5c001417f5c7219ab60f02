import java.util.Random;
import java.util.Scanner;

public class BadMagicNumber {
	public static void main(String[] args) {
		System.out.println("Welcome to Mr. Marshall's Wonderful Number Guessing Game!\n");
		int magicNum;
		int max = 1000;
		boolean replay = true;
		int guess;
		Scanner s = new Scanner(System.in);
		Random r = new Random((int)(Math.random()*100));
		while(replay){
			magicNum = r.nextInt(max+1);
			boolean result = false;
			for(int i = 0; i < 10 && !result; i++){
				do{
					System.out.println("Enter a guess from 0 to " + max);
					guess = s.nextInt();
					if(guess < 0 || guess > max)
						System.out.println("Invalid guess. Please try again.");
				}while(guess < 0 || guess > max);
				if(guess == magicNum){
					System.out.println("Congratulations! You got it!");
					result = true;
				}
				else{
					if(guess < magicNum)
						System.out.println("Your guess was too low");	
					else
						System.out.println("Your guess was too high");
				}
			}
			if(!result){
				System.out.println("Sorry, you are out of guesses.");
				System.out.println("The magic number was " + magicNum);
			}
			System.out.println("Would you like to play again? (Enter Y or N)");
			String answer;
			while( true ){
				answer = s.nextLine();
				if( answer.equals("Y") || answer.equals("y")|| answer.equals("N") || answer.equals("n"))
					break;
				System.out.println("Please enter Y or N.");
			}
			if(answer.equals("N") || answer.equals("n"))
				replay = false;
		}
	}
}
