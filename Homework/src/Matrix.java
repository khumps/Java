public class Matrix
	{
	private int[][] matrix;
	public Matrix(int[][] a)
		{
		this.matrix = a;
	}
	
	public static int[][] addMatrix(int[][] a, int[][] b)
		{
		int[][] sum = new int[a.length][2];
		for(int row = 0; row < a.length; row++)
			{
			for(int col = 0; col < a[row].length; col++)
				{
				sum[row][col] = a[row][col] + b[row][col];
			}
		}
		return sum;
	}
	
	public static String matrixToString(int[][] m)
		{
		String s = "";
		for(int row = 0; row < m.length; row++)
		   {
			   for(int col = 0; col < m[row].length; col++)
				   {
				   s += m[row][col];
			   }
			s += '\n';
		   }
		return s;
	}
	
	public static void main(String[] arrrgs)
		{
		int[][] a = {{1,2,3,4,5}, {1,2,3,4,5}};
		int[][] b = {{1,2,3,4,5}, {1,2,3,4,5}};
		
		System.out.println(matrixToString(addMatrix(a,b)));
	}
}