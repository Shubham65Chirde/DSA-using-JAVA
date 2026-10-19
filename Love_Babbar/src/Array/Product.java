package Array;

public class Product {

	public static void main(String []args)
	{
		int[][] arr = {{1,2},
				{3,4}};
		
		int pro = 1;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				int val = arr[i][j];
				
				pro *= val;
			}
		}
		
		System.out.println(pro);
	}
}
