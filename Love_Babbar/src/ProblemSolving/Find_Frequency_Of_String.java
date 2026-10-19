package ProblemSolving;

public class Find_Frequency_Of_String {

	public static void main(String []args)
	{
		String str = "programming";
		
		
		
		for(int i = 0; i<str.length(); i++)
		{
			int count = 1;
		    char ch = str.charAt(i);
			
			for(int j = 0; j<i; j++)
			{
				if(str.charAt(j)==ch)
				{
					count = 0;
					break;
				}
			}
			
			if(count == 0)
				continue;
			
			
			for(int j = i+1; j<str.length(); j++)
			{
				if(str.charAt(j)==ch)
				{
					count++;
				}
			}
			
			System.out.println("Frequency of char "+ch+" is : "+count);
			
		}
		
		
    }
}
