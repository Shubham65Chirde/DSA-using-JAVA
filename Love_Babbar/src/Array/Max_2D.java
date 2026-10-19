package Array;

import java.util.*;

public class Max_2D {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][2];
		
		int max = arr[0][0];
		
		System.out.println("Enter Elements : ");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
		}
		
		System.out.println(max);
	}
}
