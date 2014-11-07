//~Deh

public class testingPastries
{
	public static void main(String[] args)
	{
		dragonPastries balthazar = new dragonPastries();
		dragonPastries[] myArray = new dragonPastries[4];
		ogrePastry og = new ogrePastry();
		System.out.println(balthazar);
		for(int i = 0; i < myArray.length; i++)
		{
			myArray[i] = new dragonPastries();
		}
		String sick = balthazar.willMakeYouSick();
		System.out.println(sick);		
		
		System.out.println(og.willMakeYouSick(6));
		long x = 50;
		float y = 90.453f;
		double z = y;
		print(z);
		
	}
	
	public static void print(double x)
	{
		System.out.println(x);
	}
}