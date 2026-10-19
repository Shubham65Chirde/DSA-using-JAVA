package ProblemSolving;

public class SearchElement {

	public boolean Search(int[] arr, int tar)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(tar==arr[i])
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String []args)
	{
		int arr[] = {2,3,4,5,6,7,8,9};
		int tar = 8;
		
		SearchElement se = new SearchElement();
		boolean ele = se.Search(arr, tar);
		
		if(ele)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not present");
		}
	}
}
