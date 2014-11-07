//~Deh

import java.util.*;

public class TestGradePredictor{
	public static void main(String[] args){
		String name = "", letter = "";
		int[] x = new int[3];
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		name = args[0];
		
		if(name == ""){
			System.out.println("You must enter a name on the command line.");
			System.exit(0);
		}
		
		GradePredictor grade = new GradePredictor();
		
	   x = grade.getLetters(name);
		num = grade.estimateGrade(x);
		letter = grade.assignGrade(num);
		
		System.out.println("Name: " + name);
		System.out.println("Estimated grade: " + num);
		System.out.println("Letter grade: " + letter);
	}
}