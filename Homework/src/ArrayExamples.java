/* package whatever; // don't place package name! */

/* Name of the class has to be "Main" only if the class is public. */
public class ArrayExamples
{
    /*
	 * Counts the number of even values in an array
	 * of int values
	 * 
	 * Parameter:
	 * 	int[] vals = the array of integer values
	 * 
	 * Returns: the tally of even values in vals
	 */
	public static int countEvens(int[] vals){
		int tally = 0;
		for(int num: vals){
			if(num % 2 == 0){
				tally++;
			}
		}
		return tally;
	}
	/*
	 * Returns an array containing all of the even
	 * values from the array parameter
	 */
	public static int[] getEvens(int[] vals){
		int j = 0;
		int[] evens = new int[countEvens(vals)];
		for(int i = 0; i <vals.length; i++)
			{
			if(vals[i] % 2 == 0)
				{
				evens[j++] = vals[i];
			}
		}
		return evens;
	}
	
	public static void sortArray(int[] a)
		{
		for(int inner = 0; inner < a.length; inner++)
			{
			for(int outer = inner +1; outer < a.length; outer++)
				{
				if(a[inner] > a[outer])
					{
					int temp = a[inner];
					a[inner] = a[outer];
					a[outer] = temp;
				}
			}
			
		}
	}
    
        public static String arrayToString(int[] a){
		String s = "";
		for(int n: a)
			s += n + " ";
		return s;
	}
    
	public static void main(String[] args) {
		
		int[] a = {2, 4, 5, 7, 8, 9, 3, 6};
		
		System.out.println("The number of even values: " + countEvens(a));
        System.out.println(arrayToString(a));
		System.out.println(arrayToString(getEvens(a)));
		sortArray(a);
		System.out.println(arrayToString(a));
	}
    /*
     * The number of even values: 4
     * 2 4 5 7 8 9 3 6 
     * 2 4 8 6 
     */


}