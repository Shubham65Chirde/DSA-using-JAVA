package ProblemSolving;

import java.util.*;

public class ExtremeAlternate {
	
	public static void main(String []args)
	{
		int[] arr = {1,2,3,4,5,6};
		
		ExtremeAlternate ea = new ExtremeAlternate();
		
		List<Integer> list = ea.alternate(arr);
		
		for(int a : list)
		{
			System.out.print(a+" ");
		}
	}

	public List alternate(int[] arr)
	{
		List<Integer> ls = new ArrayList<>();
		
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right)
		{
			if(left == right)
			{
				ls.add(arr[left]);
			}
			else
			{
				ls.add(arr[left]);
				ls.add(arr[right]);
			}
			left++;
			right--;
		}
		return ls;
	}
}
