package Array;

public class LinearSearch {
	
	public static void main(String []args)
	{
		int[][] arr = {{1,2,4,6},
				{2,4,5},
				{3,2}};
		
		
		int tar = 6;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] == tar)
				{
					System.out.println("Element Present at index : "+i+" "+j);
					return;
				}
			}
		}
		
		System.out.println("Not Present");
		
	}

}
