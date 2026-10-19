package Array;

public class Min_2D {
	
	public static void main(String []args)
	{	
		int [][] arr1 = {{15,26}, {10,9}};
		
		int min = arr1[0][0];
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				if(arr1[i][j] < min)
				{
					min = arr1[i][j];
				}
			}
		}
		
		System.out.println(min);
	}

}
