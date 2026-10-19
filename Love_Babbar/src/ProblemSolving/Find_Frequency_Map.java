package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class Find_Frequency_Map {

	public static void main(String []args)
	{
		Map<Character , Integer>  map = new HashMap<>();
		
		String str = "Programmming";
		
		for(char ch : str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(map);
	}
}
