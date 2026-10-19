package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {

	public List DtoB(int n)
	{
		
		int num = n;
		List<Integer> ls = new ArrayList<>();
		
		while(num > 0)
		{
			int rem = num % 2;
			ls.add(rem);
			
			num = num / 2;
		}
		return ls;
	}
	
	public static void main(String []args)
	{
		DecimalToBinary db = new DecimalToBinary();
		
		List<Integer> list = db.DtoB(13);
		
		list.forEach(System.out::print);
	}
}
