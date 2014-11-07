//~Deh

import java.util.*;

public class GuessNumber{
	
	public static void main(String[] args){
		int guess = 0, num = 1, flag = 0;
	
		Scanner scan = new Scanner(System.in);

		Random myRand = new Random();
		int rand = myRand.nextInt(101);
		
		while(num <= 8 && flag == 0)
		{
			System.out.println("Enter your guess for turn #" + num + ":");
			guess = scan.nextInt();
			
			if(guess != rand)
			{
				if(guess > rand)
					System.out.println("Your guess of " + guess + " was too high!");
				else if(guess < rand)
					System.out.println("Your guess of " + guess + " was too low!");
					
				num++;
			}
			else if(guess == rand)
			{
				System.out.println("You won the game in " + num + " turns");
				flag = 1;
			}
		}
		
		if(num > 8)
		{		
			System.out.println("You failed to guess the number. It was " + rand);
		}
	}
}