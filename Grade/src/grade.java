import java.util.Scanner;
public class grade {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		String grade = input.next();
		
		if(grade == "a+" || grade == "A+")
			System.out.println("You got a 4.0");
		
		else if(grade == "a" || grade == "A")
			System.out.println("You got a 3.7");
		
		else if(grade == "a-" || grade == "A-")
			System.out.println("You got a 3.3");
		
		else if(grade == "b+" || grade == "B+")
			System.out.println("You got a 3.0");
		
		else if(grade  == "b" || grade == "B")
			System.out.println("You got a 2.7");
		
		else if(grade == "b-" || grade == "B-")
			System.out.println("You got a 2.3");
		
		else if(grade == "c+" || grade == "C+")
			System.out.println("You got a 2.0");
		
		else if(grade  == "c" || grade == "C")
			System.out.println("You got a 1.7");
		
		else if(grade == "c-" || grade == "C-")
			System.out.println("You got a 1.3");
		
		else if(grade == "d+" || grade == "D+")
			System.out.println("You got a 1.0");
		
		else if(grade  == "d" || grade == "D")
			System.out.println("You got a 0.7");
		
		else if(grade == "d-" || grade == "D-")
			System.out.println("You got a 0.3");
		
		else if(grade == "f" || grade == "F")
			System.out.println("You got a 0.0 You Suck!");
		
		else
			System.out.println("You really suck because you dont know what a letter grade is");
	}
	

}
