package module3;

public class stringss {

	public static void main(String[] args) {
		String ashu = "ashu";
		char t = 'c';
		
		//boolean x = hasLetter(ashu,t);
		// System.out.println(x);
		//boolean x = hasLetter(ashu,t);
		//int number = howMany("ashu is smart than anything you ca n think or n o t");
		//System.out.println(number);
		String exp = replace("a happy", 'a','i');
		System.out.println(exp);
		
		
	}

	public static String replace(String word, char gone, char here)
	{
		char carray[] = word.toCharArray();
		char modified[] = new char [carray.length];
		int i = 0;
		for (char c : carray)
		
		{
			if (c == gone)
				modified[i]=here;
			else
				modified[i]=c;
			i++;
			
		}
		return new String (modified);
		
	}
		
		
public static boolean hasLetter (String word, char letter)
		  {
			  for(char c : word.toCharArray())
			  {
				 if (c == letter)
					 return true;
			  }
		  return false;
		  }

public static int howMany(String word)
{
	char space = ' ';
	int count = 1;
	for (char c :word.toCharArray())
	{
		if(space ==c)
			count ++;
	}
	return count;
}
}
		  
	


