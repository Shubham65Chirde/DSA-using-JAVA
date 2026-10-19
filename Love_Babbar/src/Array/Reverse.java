package Array;

public class Reverse {

	public static void main(String []args)
	{
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=arr.length; j>0; j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
