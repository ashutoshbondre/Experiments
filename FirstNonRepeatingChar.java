import java.util.HashMap;

public class FirstNonRepeatingChar {

	public static  Character FirstNon(String input)
	{
		HashMap<Character, Integer> Hmap= new HashMap<Character,Integer> ();
		for(int i =0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(!Hmap.containsKey(c))
			{
				Hmap.put(c, 1);
			}
			else
			{
				Hmap.put(c, Hmap.get(c) + 1);
			}
		}
			for(int i=0;i<input.length();i++)
			{
				char c = input.charAt(i);
				if(Hmap.get(c)==1)
					return c;
				
			}
			return null;
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(FirstNon("ages and ages "));
	}
}

