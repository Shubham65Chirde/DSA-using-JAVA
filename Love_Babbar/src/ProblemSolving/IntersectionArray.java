package ProblemSolving;

import java.util.*;

public class IntersectionArray {

	public List Alternate(int[] arr1, int[] arr2)
	{
		List<Integer> ls = new ArrayList<>();
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
				    ls.add(arr1[i]);
				}
			}
		}
		
		return ls;
	}
	
	public static void main(String []args)
	{
		int[] arr1 = {1,2,4,5,3,6};
		int[] arr2 = {4,6,7,8};
		
		
		IntersectionArray i = new IntersectionArray();
		
		List<Integer> ans = i.Alternate(arr1, arr2);
		
		for(int x : ans)
		{
			System.out.print(x+" ");
		}
	}
}
