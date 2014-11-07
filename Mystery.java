/* Figure out the functionality of this class.
 * Change the output to be meaningful.
 * Give the variables names appropriate to their usage.
 */

import java.util.Random;
import java.util.Scanner;

public class Mystery {
	public static void main(String[] args) {
		System.out.println("Welcome to ...\n");
		int a;
		int b = 1000;
		boolean c = true;
		int d;
		Scanner e = new Scanner(System.in);
		Random f = new Random((int)(Math.random()*100));
		while(c){
			a = f.nextInt(b+1);
			boolean g = false;
			for(int i = 0; i < 10 && !g; i++){
				do{
					System.out.println("... " + b);
					d = e.nextInt();
					if(d < 0 || d > b)
						System.out.println("...");
				}while(d < 0 || d > b);
				if(d == a){
					System.out.println("...");
					g = true;
				}
				else{
					if(d < a)
						System.out.println("...");	
					else
						System.out.println("...");
				}
			}
			if(!g){
				System.out.println("...");
				System.out.println("... " + a);
			}
			System.out.println("...");
			String h;
			while( true ){
				h = e.nextLine();
				if( h.equalsIgnoreCase("y")|| h.equalsIgnoreCase("n"))
					break;
				System.out.println("...");
			}
			if(h.equalsIgnoreCase("n"))
				c = false;
		}
	}
}
