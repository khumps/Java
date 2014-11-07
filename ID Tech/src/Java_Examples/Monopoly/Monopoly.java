//Monopoly
//Plays a game of Monopoly and gives a report of averages of times people land on spaces
//~Deh

public class Monopoly{

	//initialize constants
	private static int players = 100000, timesAroundBoard = 25;
	
	//Create a string containing the space names on the board
	private String [] board = {"Go","Mediterranean Ave","Community Chest(1)","Baltic","Income Tax","Reading RR",
		"Oriental Ave","Chance(1)","Vermont Ave","Connecticut Ave","In Jail","St. Charles Place","Electric Co","States Ave",
		"Virginia Ave","Pennsylvania RR","St. James Place","Community Chest(2)","Tennessee Ave","New York Ave","Free Parking",
		"Kentucky Ave","Chance(2)","Indiana Ave","Illinois Ave","B&O Railroad","Atlantic Ave","Ventnor Ave","Water Works","Marvin Gardens",
		"Go To Jail","Pacific Ave","North Carolina Ave","Community Chest(3)","Pennsylvania Ave","Short Line RR","Chance(3)","Park Place",
		"Luxury Tax","Boardwalk"};
		
	public double [] analyze(){
		//create variables necessary only for the method
		int[] numberOfTimes = new int[40];
		double[] percents = new double[40];
		int playerPosition = 1, circuit = 1;
		double totalVisits = 0;
		
		//Create Dice object
		Dice die = new Dice();
		
		//Run until all the players have played (10000)
		for(int i = 0; i < players; i++){
			//Go around the board for 25 circuits
			while(circuit < timesAroundBoard){
				playerPosition += die.roll2Dice();
				
				//bring to start of board and prevent array overflow 
				if(playerPosition >= 40){
					playerPosition = 0;
					circuit++;
				}

				//GO TO JAIL ;)
				if(playerPosition == 31){
					circuit++;
					numberOfTimes[31] += 1;
				}
				else // keep adding to the position otherwise
					numberOfTimes[playerPosition] += 1;
			}
				//reset the position of each player at start
				playerPosition = 0;
		}
		
		for(int i = 0; i < 40; i++){
			//count the total visits to all spaces
			totalVisits += numberOfTimes[i];
		}
		
		//calculate percents
		//pctVisit for a space = (visits to space / total visits) * 100
		for(int i = 0; i < 40; i++){
			percents[i] = (numberOfTimes[i] / totalVisits) * 100;
		}
		return percents;
	}
	
	public void listResults(double[] percents){
		//print results
		System.out.println("Study results:");
		for(int i = 0; i < 40; i++){
			//printf for a nice column :)
			System.out.printf("%22s %3.2f\n", board[i] + " : ", percents[i]);
		}
	}
}