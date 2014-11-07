//TestGame
//Tests the Monopoly game
//~Deh

public class TestGame{
	public static void main(String[] args){
		//create Monopoly object
		Monopoly game = new Monopoly();
		//pass array from running analyze
		double[] percents = game.analyze();
		//pass percents and print in listResults
		game.listResults(percents);
	}
}