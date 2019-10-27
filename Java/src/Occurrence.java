import java.util.HashMap;
public class Occurrence 

{
	public static void main(String[]args)
	{
		String [] str = {"A","B","1" ,"D","A","B","1" ,"D","A","B","1" ,"D","2","aa","A","B","A","B","A","B"};
		HashMap <String , Integer> hm = new HashMap<String, Integer>();
		for(String s : str)
		{
			hm.put(s, s.length());
		}
		System.out.println(hm);
		
	}
}
