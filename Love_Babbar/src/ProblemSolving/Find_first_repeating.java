package ProblemSolving;

public class Find_first_repeating {

	public static void main(String []args)
	{
		String str = "programming";
		
		for(int i=0; i<str.length()-1; i++)
		{
			char ch = str.charAt(i);
			
			for(int j = i+1; j<str.length(); j++)
			{
				char c = str.charAt(j);
				
				if(ch == c)
				{
					System.out.println(c);
					return;
				}
			}
		}
	}
}
