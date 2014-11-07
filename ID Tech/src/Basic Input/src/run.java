import java.util.Scanner;

public class run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		float weight;
		
		//read input from console
		System.out.println("Enter your name: ");
		name = input.nextLine();
		
		System.out.println("How old are you? ");
		age = input.nextInt();
		
		System.out.println("What is your weight? ");
		weight = input.nextFloat();
		
		//print out to the console
		System.out.println("My name is " + name);
		System.out.println("and I am " + age);
		System.out.println("I weigh " + weight + " pounds.");
		
		//close the Scanner
		input.close();
	
	}//end of main

}
