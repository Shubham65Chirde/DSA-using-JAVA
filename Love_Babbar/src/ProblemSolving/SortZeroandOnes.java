package ProblemSolving;

import java.util.List;
import java.util.stream.Collectors;

public class SortZeroandOnes {

	public int[] sort(int[] arr)
	{
		int n = arr.length;
		int i = 0;
		int j = n-1;
		
		while(i < j)
		{
			if(arr[i] == 1 &&  arr[j] == 0)
			{
				arr[i] = 0;
				arr[j] = 1;
			}
			
			if(arr[i] == 0)
			{
				i++;
			}
			
			if(arr[j] == 1)
			{
				j--;
			}
		}
		
		return arr;
	}
	public static void main(String []args)
	{
//		List<Integer> list = List.of(1,0,1,0,0,1,1);
//		
//		List<Integer> res = list.stream().sorted().collect(Collectors.toList());
//		
//		res.forEach(System.out::println);
		
		SortZeroandOnes sz = new SortZeroandOnes();
		
		int[] arr = {1,1,0,1,0,0,1};
		
		int[] nums = sz.sort(arr);
		
		for(int num : nums)
		{
			System.out.println(num);
		}
	}
}
