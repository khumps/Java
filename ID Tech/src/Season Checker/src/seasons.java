import java.util.Scanner;
public class seasons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String month;
		String restart;
		
		
		while (true)
		{
		
		System.out.println("Enter the current month");
		
		month = input.nextLine();
		
		if(month.contains ("january") || month.contains ("february") || month.contains ("march") || month.contains ("december"))
		{
			System.out.println("It is currently Winter");
			System.out.println("would you like to know another month Y(Yes) or N(No)?");
			restart = input.nextLine();
			if (restart.contains("n"))
			{
				break;
			}
		}
		
		else if(month.contains ("april") || month.contains ("may"))
		{
			System.out.println("It is currently Spring");
			System.out.println("would you like to know another month Y(Yes) or N(No)?");
			restart = input.nextLine();
			if (restart.contains("n"))
			{
				break;
			}
		}
		
		else if(month.contains ("june") || month.contains ("july") || month.contains ("august"))
		{
			System.out.println("It is currently Summer");
			System.out.println("would you like to know another month Y(Yes) or N(No)?");
			restart = input.nextLine();
			if (restart.contains("n"))
			{
				break;
			}
		}
		
			
		else
		{	
			System.out.println("Sorry that is not a month.");
			System.out.println("would you like to know another month Y(Yes) or N(No)?");
			restart = input.nextLine();
			if (restart.contains("n"))
			{
				break;
			}
		}
		
		
		}
	
	}
}

