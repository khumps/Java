import java.util.*;

public class Store{
	public static void promptForItem(Scanner thing, String it, int len, int itCo){
		System.out.println("What do you wish to buy? ");
		it = thing.nextLine();
		len = it.length();
		buyItem(it, len, itCo);
	}
	
	public static int calculateCost(int len){
		//cost += itemCost;
		return len * 100;
	}
	
	public static void buyItem(String it, int len, int itCo){
		itCo = calculateCost(len);
		System.out.println("Excellent. The " + it + " cost " + itCo + " gold");
	}
	
	public static void main(String[] args){
		String item = "";
		int itemCost = 0, len = 0;
		Scanner myScanner = new Scanner(System.in);
		promptForItem(myScanner, item, len, itemCost);	
	}
}