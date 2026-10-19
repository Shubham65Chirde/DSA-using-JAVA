package ProblemSolving;

public class MultiplyBY10 {

	public int[] mul(int[] arr)
	{
		
		int size = arr.length;
		int newArray[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			int ele = arr[i];
			int newEle = ele * 10;
			newArray[i] = newEle;
		}
		return newArray;
		
	}
	
	public static void main(String []args)
	{
		int arr[] = {2,3,4,5};
		MultiplyBY10 mp = new MultiplyBY10();
		
		int ans[] = mp.mul(arr);
		
		for(int i:ans)
		{
			System.out.println(i);
		}
	}
}
