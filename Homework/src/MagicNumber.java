import java.util.Random;
import java.util.Scanner;

public class MagicNumber {
	private int magicNum;
	private int max;
	
	public MagicNumber(int seed){
		if(seed <= 0)
			seed = 1000;
		max = seed;
		reset();
	}
		
	public MagicNumber(){
		this(1000);
	}
	
	private void reset(){
		Random r = new Random((int)(Math.random()*100));
		magicNum = r.nextInt(max+1);
	}
	
	private int userGuess(){
		Scanner s = new Scanner(System.in);
		int guess;
		do{
			System.out.println("Enter a guess from 0 to " + max);
			guess = s.nextInt();
			if(guess < 0 || guess > max)
				System.out.println("Invalid guess. Please try again.");
		}while(guess < 0 || guess > max);
		return guess;
	}
	
	private boolean testGuess(int guess){
		if(guess == magicNum){
			System.out.println("Congratulations! You got it!");
			return true;
		}
		if(guess < magicNum)
			System.out.println("Your guess was too low");	
		else
			System.out.println("Your guess was too high");
		return false;				
	}
	
	private boolean playAgain(){
		System.out.println("Would you like to play again? (Enter Y or N)");
		Scanner s = new Scanner(System.in);
		while( true ){
			String answer = s.nextLine();
			if( answer.equals("Y") || answer.equals("y"))
				return true;
			else if( answer.equals("N") || answer.equals("n"))
				return false;
			else
				System.out.println("Please enter Y or N.");
		}
	}
	public void playGame(){
		System.out.println("Welcome to Mr. Marshall's Wonderful Number Guessing Game!\n");
		boolean replay = true;
		while(replay){
			boolean result = false;
			for(int i = 0; i < 10 && !result; i++){
				int guess = userGuess();
				result = testGuess(guess);
			}
			if(!result){
				System.out.println("Sorry, you are out of guesses.");
				System.out.println("The magic number was " + magicNum);
			}
			replay = playAgain();
			reset();
		}
	}
	
	public static void main(String[] args) {
		MagicNumber m = new MagicNumber(10);
		m.playGame();
	}	
}