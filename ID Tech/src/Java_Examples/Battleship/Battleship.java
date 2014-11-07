//~Deh

import java.util.*;

public class Battleship{	
	public boolean[][] hasShip = new boolean[10][10];
	public boolean[][] alreadyFired = new boolean[10][10];
	public int hitCount = 0;
	
	public void init(){	
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				hasShip[i][j] = false;
				alreadyFired[i][j] = false;
			}
		}
		
		for(int i = 3; i < 9; i++){
				hasShip[4][i] = true;
		}
	}
	
	public void fire(int row, int col){
		if(alreadyFired[row][col] == true)
			System.out.println("You already shot there!");
		else if(hasShip[row][col] == true){
			System.out.println("Hit!");
			hitCount++;
			alreadyFired[row][col] = true;
			if(hitCount == 5){
				System.out.println("You sunk my Battleship!");
				System.exit(0);
			}
		}
		else
			System.out.println("Miss!");
	}
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int row = 0, col = 0, flag = 0;
		
		Battleship ship = new Battleship();
		ship.init();
		
		while(flag == 0){
			System.out.println("Guess a row:");
			row = scan.nextInt();
			System.out.println("Guess a column:");
			col = scan.nextInt();

			ship.fire(row, col);
		}
	}
}