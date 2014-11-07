//~Deh

import java.util.*;

public class Deck{
	Card[] deck = new Card[52];
	
	public String deal(int handSize){
				
		int card = 0, j = 0;
		String temp = "";
		
		for(int i = 0; i < 13; i++){
			deck[i] = new Card("Hearts", i+1);
			deck[i+13] = new Card("Clubs", i+1);
			deck[i+26] = new Card("Spades", i+1);
			deck[i+39] = new Card("Diamonds", i+1);
		}
		
		while(j <= handSize){
			card = (int)(52 * Math.random()) + 1;
			j++;
			temp += deck[card].toString() + ", ";
		}
		
		return temp;
	}
}