//~Deh

import java.util.*;

public class GradePredictor{
	public int [] getLetters(String name){
		int[] x = new int[3];
		
		x[0] = name.charAt(0);
		
		if(name.length() >= 3){
			x[1] = name.charAt(2);
			
			if(name.length() >= 5)
				x[2] = name.charAt(4);	
		}
		
		return x;
	}
	
	public int estimateGrade(int array[]){
		int estimate = 0;
		
		estimate = estimate + array[0];
		
		if(array[1] != 0){
			estimate = estimate + array[1];
			
			if(array[2] != 0){
				estimate = estimate + array[2];
			}
		}
		estimate = estimate * 85;
		estimate = estimate % 101;
		return estimate;
	}
	
	public String assignGrade(int value){
		String letter = "";
		if(value >= 90)
			letter = "A";
		else if(value >= 80 && value < 90)
			letter = "B";
		else if(value >= 70 && value < 80)
			letter = "C";
		else if(value >= 60 && value < 70)
			letter = "D";
		else
			letter = "F";
		return letter;
	}
}