import java.util.Scanner;
public class Easy_Math {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String PlayAgain = "Y";
	while (PlayAgain.equals("Y"))
	{
		// TODO Auto-generated method stub
		
		//declare variables
		Scanner input = new Scanner(System.in);

		int number;
		int y;

		System.out.println("Input a value for x: ");
		number = input.nextInt();
		//assign values
		y = number * number;
		System.out.println(number + " Squared equals " + y);
		
        System.out.println("Would you like to play again? Y/N ");
        PlayAgain = input.next();
        PlayAgain = PlayAgain.toUpperCase();

        
	}
	}
}
