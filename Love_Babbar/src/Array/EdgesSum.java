package Array;

import java.util.*;

public class EdgesSum {
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int row = arr.length;
		int col = arr[0].length;
		int sum = 0;
		
		System.out.println("Enter Array Element : ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int row1=0; row1<arr.length; row1++)
		{
			for(int col1=0; col1<arr[row1].length; col1++)
			{
				if(row1 == 0 || row1 == row-1 || col1 == 0 || col1 == col - 1  )
				{
					sum += arr[row1][col1];
				}
			}
		}
		
		System.out.println(sum);
	}

}
