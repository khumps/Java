//TicTacToe
//~Deh

import java.util.*;

public class TicTacToe{
	char[][]x = new char[3][3];
	//two dimensional array initialized
	
   int check, move, player = 1;
	String board = "";
	
	//class to initialize array, setting all elements to ' '
	public void init(){
		for(int i = 0; i < 3; i++){
        	for(int j = 0; j < 3; j++){
             x[i][j] = ' ';
      	}
		}
	}
	
	//check to see if a player wins or not
	//sorts out every possibility of winning
	//return true if won or false if not yet won
	
	public boolean win(){
				if(x[0][0] == 'O' && x[1][1] == 'O' && x[2][2] == 'O')
            {
                 System.out.println("Player 1 wins!");  
                 return true; 
            }
            if(x[0][0] == 'O' && x[0][1] == 'O' && x[0][2] == 'O')
            {
                 System.out.println("Player 1 wins!");  
                 return true; 
            }
            if(x[0][0] == 'O' && x[1][0] == 'O' && x[2][0] == 'O')
            {
                 System.out.println("Player 1 wins!");  
                 return true; 
            }
            if(x[0][2] == 'O' && x[1][1] == 'O' && x[2][0] == 'O')
            {
                 System.out.println("Player 1 wins!");  
                 return true; 
            }
            if(x[0][2] == 'O' && x[1][2] == 'O' && x[2][2] == 'O')
            {
                 System.out.println("Player 1 wins!");  
                 return true; 
            }
            if(x[2][0] == 'O' && x[2][1] == 'O' && x[2][2] == 'O')
            {
                 System.out.println("Player 1 wins!");  
                 return true; 
            }
            
            if(x[0][0] == 'X' && x[1][1] == 'X' && x[2][2] == 'X')
            {
                 System.out.println("Player 2 wins!");  
                 return true; 
            }
            if(x[0][0] == 'X' && x[0][1] == 'X' && x[0][2] == 'X')
            {
                 System.out.println("Player 2 wins!");  
                 return true; 
            }
            if(x[0][0] == 'X' && x[1][0] == 'X' && x[2][0] == 'X')
            {
                 System.out.println("Player 2 wins!");  
                 return true; 
            }
            if(x[0][2] == 'X' && x[1][1] == 'X' && x[2][0] == 'X')
            {
                 System.out.println("Player 2 wins!");  
                 return true; 
            }
            if(x[0][2] == 'X' && x[1][2] == 'X' && x[2][2] == 'X')
            {
                 System.out.println("Player 2 wins!");  
                 return true; 
            }
            if(x[2][0] == 'X' && x[2][1] == 'X' && x[2][2] == 'X')
            {
                 System.out.println("Player 2 wins!");  
                 return true; 
            }
				return false;
	}
	
	//takes inputs for each players moves and checks for correct values
	//also checks to see if the space has already been used in a move
	public void move(){
		int a = 0, b = 0;
      check = 1;
		
		Scanner input = new Scanner(System.in);
                 
	   while(check != 0){
			if(player == 1)
         	System.out.println("Player 1 move: (x, y)\n");
			else if(player == 2)
         	System.out.println("Player 2 move: (x, y)\n");
			a = input.nextInt();
			b = input.nextInt();
                         
         while(a >= 3 || b >= 3 || a < 0 || b < 0){
              a = input.nextInt();
			     b = input.nextInt();
         }
			
         if(x[a][b] == ' '){
				  if(player == 1)
              		x[a][b] = 'O';
			     else
				  		x[a][b] = 'X';
						
              check = 0;
         }
         else
              System.out.println("Space already taken");

         a = 0;
         b = 0;
			
			if(player == 1)
				player = 2;
			else if(player == 2)
				player = 1;
       }	 
	}
	
	//returns the # player's turn
	public int turn(){
		return player;
	}
	
	//sends the whole board to a string, formatted correctly
	public String toString(){
		board = "";
		board += "\n-------\n";
		for(int i = 0; i < 3; i++){
			board += "|";
        	for(int j = 0; j < 3; j++){
             board += x[i][j] + "|";
      	}
			board += "\n-------\n";
		}
		return board;
	}
}