import java.util.*;
public class paranthe {

	public static void addParan(ArrayList<String> list , int left,int right,char str[], int count)
	{
		if(left<0 || right<left) return;
		if(left==0 && right==0)
		{
			String s = String.copyValueOf(str);
		list.add(s);
		}
		else
		{
			if(left>0)
				{
				
				str[count] = '(';
				addParan(list,left-1,right,str,count+1);
				}
			if(right>left)
			{
			
			str[count] = ')';
			addParan(list,left,right-1,str,count+1);
			}
				
		}
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 3;
		char str[] = new char[count*2];
		ArrayList<String> list = new ArrayList<String>();
		addParan(list,count,count,str,0);
		System.out.println(list);

	}

}
