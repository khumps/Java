//PlayGame
//runs the TicTacToe class
//~Deh

import java.util.*;

public class PlayGame{
	public static void main(String[] args){
	
		//make a TicTacToe object
		TicTacToe play = new TicTacToe();
		
		//prepare string for board
		String pic = "";
		
		//keep playing till someone wins
		while(play.win() == false){
			play.init();
			play.move();
			pic = play.toString();
			
			//print the board
			System.out.println(pic);
		}
	}
}