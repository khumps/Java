//~Deh

import java.util.*;

public class Card{
	public int valueOfCard;
	public String suitOfCard;
	
	public Card(String suit, int value){
		valueOfCard = value;
		suitOfCard = suit;
	}
	
	public String toString(){
		String cardName = "";
		
		switch(valueOfCard){
			case 1:
				cardName += "Ace of ";
				cardName += suitOfCard;
				break;
			case 11:
				cardName += "Jack of ";
				cardName += suitOfCard;
				break;
			case 12:
				cardName += "Queen of ";
				cardName += suitOfCard;
				break;
			case 13:
				cardName+= "King of ";
				cardName += suitOfCard;
				break;
			default:
				cardName += valueOfCard;
				cardName += " of ";
				cardName += suitOfCard;
				break;
		}
		return cardName;
	}
}