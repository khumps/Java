// TestDeck - tests the other two classes
//~Deh

import java.util.*;

public class TestDeck {
	// run tests in the main
	public static void main(String [] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);
		
		// get number of cards to use
		System.out.println("Enter # of cards to get (1-52):");
		int handSize = input.nextInt();
		
		// validate entry
		if(handSize < 1 || handSize > 52) {
			System.out.println("Invalid hand size - exiting");
			return;
		}
		
		// create the Deck
		Deck deckOfCards = new Deck();
		
		// get the hand of cards
		String hand = deckOfCards.deal(handSize);
		System.out.println("\nHand of cards dealt:");
		System.out.println(hand);
		
	}
}