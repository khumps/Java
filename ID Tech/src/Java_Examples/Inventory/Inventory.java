//~Deh

import java.util.*;

public class Inventory{
	public static void thingsCarried(String[] list, int thingsCarried){
		System.out.println("You are carrying:");
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] != null)
				System.out.println(list[i]);
		}
		System.out.println("");
	}
	
	public static String[] addItem(int thingsCarried, String[] list, Scanner scan){
		System.out.println("What will you pick up?");
		if(thingsCarried <= 2){
				scan.nextLine();
				list[thingsCarried] = scan.nextLine();
				return list;
		}
		else{
			System.out.println("Sorry, carrying too much already.");
			return list;
		}
	}
	
	public static void main(String[] args){
		int flag = 0, response = 0, thingsCarried = 1;
		String[] list = new String[3];
		list[0] = ("Bits of pocket fluff");
		
		Scanner scan = new Scanner(System.in);
		
		while(flag == 0){
			System.out.println("Inventory options:");
			System.out.println("1) List inventory");
			System.out.println("2) Add item to inventory");
			System.out.println("3) Quit");
			
			response = scan.nextInt();
			
			switch(response){
				case 1: 
				{
					thingsCarried(list, thingsCarried);
					break;
				}
				case 2:
				{
					list = addItem(thingsCarried, list, scan);
					thingsCarried++;
					break;
				}
				case 3:
				{
					System.out.println("Ok, bye.");
					flag = 1;
				}
			}
		}
	}
}