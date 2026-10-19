package ProblemSolving;

public class Second_non_repeating {

	public static void main(String []args)
	{
		String str = "siwss";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(str.indexOf(ch) == str.lastIndexOf(ch))
			{
				count++;
				
				if(count == 2)
				{
					System.out.println(ch);
					break;
				}
			}
		}
	}
}
