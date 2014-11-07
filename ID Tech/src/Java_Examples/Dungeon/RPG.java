/**
 * RPG - the main program for our RPG project
 *
 * @author Deh
 */
 
public class RPG {
	/**
	 * Start of the RPG program
	 * @param args command line arguments
	 */
	public static void main(String [] args) {
		// Create a Dungeon object
		// This map has 50 rows and 40 columns
		Dungeon dungeon = new Dungeon(10,50);
		
		// Build the dungeon
		// This code creates the left hand room
		dungeon.drawObject(0,0,'+');   // place a corner
		dungeon.drawHorzWall(0,1,10);  // draw the top wall
		dungeon.drawObject(0,11,'+');  // place a corner
		dungeon.drawVertWall(1,0,6);   // draw left wall
		dungeon.drawHorzWall(7,1,10);  // draw the bottom wall	
		dungeon.drawObject(7,0,'+');   // place a corner
		dungeon.drawObject(7,11,'+');  // place a corner
		dungeon.drawVertWall(1,11,1);  // draw top right wall
		dungeon.drawVertWall(5,11,2);  // draw bottom right wall
		dungeon.drawObject(2,11,'+');  // place a corner
		dungeon.drawObject(4,11,'+');  // place a corner
		dungeon.drawObject(2,3,'@');   // add explorer
		dungeon.drawObject(6,5,'W');   // add a weapon
		
		dungeon.drawHorzWall(4,12,17);  // first hallway, upper wall
		dungeon.drawObject(4,29,'+');  // place a corner
		dungeon.drawHorzWall(2,12,17);  // draw first hallway, lower wall
		dungeon.drawVertWall(2,43,7);  // draw bottom left wall
		dungeon.drawObject(2,29,'+');  // place a corner
		dungeon.drawObject(1,29,'+');  // place a corner
		dungeon.drawHorzWall(1,30,13);  // draw first hallway, higher wall
		dungeon.drawObject(1,43,'+');  // place a corner
		dungeon.drawVertWall(5,29,4);  // draw bottom left wall
		dungeon.drawObject(9,29,'+');  // place a corner
		dungeon.drawHorzWall(9,30,13);  // draw bottom wall
		dungeon.drawObject(9,43,'+');  // place a corner
		
		dungeon.drawObject(3,34,'P');   // add a potion
		dungeon.drawObject(8,32,'M');   // add a monster
		dungeon.drawObject(3,40,'*');   // add a gem
		dungeon.drawObject(3,39,'*');   // add a gem
		dungeon.drawObject(4,39,'*');   // add a gem
				
		// write out the data file
		dungeon.writeFile("dungeon.txt");
		
		Dungeon myDungeon = new Dungeon(50,50);
		myDungeon.drawObject(0,0,'+');   // place a corner
		myDungeon.drawHorzWall(0,1,10);  // draw the top wall
		myDungeon.drawObject(0,11,'+');  // place a corner
		myDungeon.drawVertWall(1,0,6);   // draw left wall
		myDungeon.drawHorzWall(7,1,10);  // draw the bottom wall	
		myDungeon.drawObject(7,0,'+');   // place a corner
		myDungeon.drawObject(7,11,'+');  // place a corner
		myDungeon.drawVertWall(1,11,1);  // draw top right wall
		myDungeon.drawVertWall(5,11,2);  // draw bottom right wall
		myDungeon.drawObject(2,11,'+');  // place a corner
		myDungeon.drawObject(4,11,'+');  // place a corner
		myDungeon.drawObject(2,3,'@');   // add explorer
		
		myDungeon.drawObject(2,14,'+');   // place a corner
		myDungeon.drawHorzWall(2,15,10);  // draw the top wall
		myDungeon.drawObject(2,25,'+');  // place a corner
		myDungeon.drawVertWall(3,14,6);   // draw left wall
		myDungeon.drawVertWall(3,25,6);   // draw right wall
		
		myDungeon.drawHorzWall(0,12,16);  // draw top wall
		myDungeon.drawObject(0, 28, '+'); // draw top right corner
		myDungeon.drawVertWall(1, 28, 13); //draw right wall
		myDungeon.drawObject(14, 28, '+'); // draw lower right corner
		myDungeon.drawHorzWall(14, 1, 27); // draw lower wall
		myDungeon.drawObject(14, 0, '+'); // draw lower left corner
		myDungeon.drawVertWall(8, 0, 6); // draw lower left wall
		myDungeon.drawObject(8,8,'*');   // add a gem
		myDungeon.drawObject(5,18,'w');   // add a weapon
		myDungeon.drawHorzWall(9,1,10); // draw middle maze wall
		myDungeon.drawObject(9, 0, '+'); // draw a corner
		myDungeon.drawObject(9, 10, '+'); // draw a corner
				
		myDungeon.writeFile("myDungeon.txt");
	}
}