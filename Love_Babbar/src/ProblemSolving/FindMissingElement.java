package ProblemSolving;

public class FindMissingElement {

	public static void main(String []args)
	{
		int[] arr = {14,3,6,7};
		int num = 5;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		
		int expectedSum = num * (num + 1) / 2;
		
		System.out.println("Missing Element : "+(sum-expectedSum));
	}
}
