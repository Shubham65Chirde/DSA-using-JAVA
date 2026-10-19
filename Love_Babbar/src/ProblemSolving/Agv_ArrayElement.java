package ProblemSolving;

public class Agv_ArrayElement {

	public static void main(String []args)
	{
		int[] arr = {2,4,1,3};
		
		int n = arr.length;
	    double sum = 0;
	    
	    for(int i=0; i<arr.length; i++)
	    {
	    	sum += arr[i];
	    }
	    
	    System.out.println("Avg of sum : "+(sum/n));
	}
}
