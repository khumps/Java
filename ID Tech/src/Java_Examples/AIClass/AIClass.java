//~Deh

public class AIClass{
	public static String findAction(boolean spy, int turretNum, int metal, boolean sappinMahSentry, int turretHp){
		String response = "";
		
		if(spy == true)
			response = "Shoot randomly and shoot teammates (and shout 'spy!')";
		else if(metal >= 150 && turretNum < 1)
			response = "Make sentry";
		else if(metal >= 150 && turretNum == 1)
			response = "Make dispenser";
		else if(turretNum == 1 && turretHp < 100)
			response = "Hit turret w/ wrench to repair";
		else if(sappinMahSentry == true)
			response = "Shoot everything";
			
		return response;
	}
}