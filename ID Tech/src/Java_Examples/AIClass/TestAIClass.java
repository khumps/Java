//~Deh

import java.util.*;

public class TestAIClass{
	public static void main(String [] args){
		String response, sense;
		int metal = 200, turretNum = 0, turretHp = 100;
		boolean spy = false, sappinMahSentry = false;

		Scanner myScanner = new Scanner(System.in);
		System.out.println("What does Engie sense?");
		sense = myScanner.nextLine();
		
		if(sense.equals("Spy!"))
			spy = true;
		else if(sense == "Sentry goin' up!")
		{
			metal = 200;
			turretNum = 0;
		}
		else if(sense == "Dispenser goin' up!")
		{
			metal = 200;
			turretNum = 1;
		}
		else if(sense.equals("Sentry takin damage!"))
		{
			turretNum = 1;
			turretHp -= 25;
		}
		else if(sense == "Sappin mah sentry!")
			sappinMahSentry = true;
		
		AIClass test = new AIClass();
		response = test.findAction(spy, turretNum, metal, sappinMahSentry, turretHp);
		System.out.println(response);
	}
}