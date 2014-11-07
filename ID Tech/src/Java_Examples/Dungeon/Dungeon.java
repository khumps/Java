import java.io.*; // needed to read the file

/**
 * Dungeon - used to create a dungeon for a simple RPG
 *
 * @author Deh
 * revised 9-23-10, added makeHorzCorridor and makeVertCorridor
 */
 
 public class Dungeon {
 	// This is the array that will hold the dungeon
	private char[][] board;
	private int numRows;
	private int numCols;
	
	/**
	 * The constructor takes the map size from the
	 * parameters.
	 * @param rows Number of rows in the map
	 * @param cols Number of columns in the map
	 */
	public Dungeon(int rows, int cols) {
		// set up the array
		board = new char[rows][cols];
		
		// save the row and column sizes
		numRows = rows;
		numCols = cols;
		
		// set the entire array to blanks
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	/**
	 * draws a vertical wall from position row,col down for len positions
	 * down for length len
	 * @param row starting row
	 * @param col starting column
	 * @param len length to draw
	 */
	public void drawVertWall(int row, int col, int len) {
		// check for errors
		if(row < 0 || row >= numRows){ // wrong row number
			return;  // do nothing
		}
		
		if(col < 0 || col >= numCols) { // wrong column value
			return; // do nothing
		}
		
		if(row + len >= numRows) { // would go off board
			return;
		}
		
		// values are OK - set the wall
		for(int i = row; i < row+len; i++) {
			board[i][col] = '|';
		}
	}
	
	/**
	 * draws a horizontal wall from position row,col right for len spaces
	 * right for length len
	 * @param row starting row
	 * @param col starting column
	 * @param len length to draw
	 */
	public void drawHorzWall(int row, int col, int len) {
		// check for errors
		if(row < 0 || row >= numRows){ // wrong row number
			return;  // do nothing
		}
		
		if(col < 0 || col >= numCols) { // wrong column value
			return; // do nothing
		}
		
		if(col + len >= numCols) { // would go off board
			return;
		}
		
		// values are OK - set the wall
		for(int i =col; i < col+len; i++) {
			board[row][i] = '-';
		}
	}

	/**
	 * Place a corner on the board
	 * @param row place at row
	 * @param col place at column
	 * @param obj object to place + - corner, * - gem, M - monster, P - potion, etc
	 */
	 public void drawObject(int row, int col, char obj){
	 	// check for errors
		if(row < 0 || row >= numRows){ // wrong row number
			return;  // do nothing
		}
		
		if(col < 0 || col >= numCols) { // wrong column value
			return; // do nothing
		}

		// if OK, place the object
		board[row][col] = obj;
	 }
	 
	 public void makeHorzCorridor(int row, int col, int len){
	 
			// values are OK - set the wall
			board[row-1][col] = '+';
			board[row+1][col] = '+';
			board[row-1][col+len-1] = '+';
			board[row+1][col+len-1] = '+';
			for(int i =col+1; i < col+len-1; i++) {
				board[row+1][i] = '-';
				board[row-1][i] = '-';
			}
	 }
	 
	 public void makeVertCorridor(int row, int col, int len){
		
			// values are OK - set the wall
			board[row-1][col] = '+';
			board[row+1][col] = '+';
			board[row-1][col+len-1] = '+';
			board[row+1][col+len-1] = '+';
			for(int i =row+1; i < row+len-1; i++) {
				board[i][col] = '|';
				board[i][col+len] = '|';
			}
			
	 }
	 
	/**
	 * Write  the data to a file
	 *
	 * @param fileName name of file to use
	 */
	public void writeFile(String fileName) {
		// exit the program if there is a problem with the file
		
		// The try/catch block are part of an error handling technique called
		// exceptions. You will learn about these in GSD 2
		try
		{
			// Open the file for writing
			FileWriter fileWrite = new FileWriter(fileName);
						
			// You will learn about loops in week 5 of the course. This
			// code writes to the file a character at a time until out of data
			for(int i = 0; i < numRows; i++) {
				for(int j = 0; j < numCols; j++) {
					fileWrite.write(board[i][j]);
				}
				// insert a CR/LF to go to the next line
				fileWrite.write('\n');
			}
			
			// close the file when done
			fileWrite.close();
		}
		catch(Exception ex) // this code gets called if an error occurs
		{
			// list the error message
			System.out.println("An error was detected: " + ex.getMessage());
			
			// exit the program
			System.exit(1);
		}
	}
 }
