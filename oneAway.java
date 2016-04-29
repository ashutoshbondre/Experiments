
public class oneAway {
	private static boolean oneEditAway(String first,String second)
	{
		if(first.length()==second.length())
		{
			System.out.println("Replace method is executed!");
			return replace(first,second);
		}
		
		else if (first.length()+1==second.length())
		{
			System.out.println("Insert method is executed!");
			return insert(first,second);
		}
		else if (first.length()-1 == second.length())
		{
			System.out.println("Delete method is executed!");
			return insert(first,second);
		}
			
		else
			return false;
	}
	
	private static boolean replace(String first,String second)
	{
		boolean foundDifference=false;
		for(int i =0;i<first.length();i++)
		{
			if(first.charAt(i)!=second.charAt(i))
				if(foundDifference)
					{return false;}
			foundDifference=true;
		}
		return true;
	}
	private static boolean insert(String first,String second)
	{
		int index1=0;
		int index2=0;
		while(index1<first.length() & index2<second.length())
		{
			if(first.charAt(index1)!=second.charAt(index2))
			{
				if(index1!=index2)
				{	return false; }
				index2++;
			}
			index1++;
			index2++;
		}
		return true;
		
	}
	
	private static String compress(String str)
	{
		StringBuilder compressed = new StringBuilder();
		int count=0;
		for(int i =0;i<str.length();i++)
		{
			count++;
			if(i+1>str.length() || str.charAt(i)!=str.charAt(i+1))
			{
				compressed.append(str.charAt(i));
				compressed.append(count);
				count=0;
			}
			
		}
		return compressed.length() < str.length() ? compressed.toString() : str ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a ="aple";
		//String b ="apple";
		//boolean ans = oneEditAway(a,b);
		//System.out.println(ans);
		String ans =compress("aabbbbccc");		
		System.out.println(ans);
	}

}
