import java.util.HashMap;

public class NotInArr {

	public static void NotDupes(int [] a,int []b)
	{
		HashMap <Integer,Integer> Hmap = new HashMap<Integer,Integer>();
		for(int i = 0;i<b.length;i++)
		{
			if(!Hmap.containsKey(b[i]))
			{
				Hmap.put(b[i], 1);
			}
			else
			{
				Hmap.put(b[i], Hmap.get(b[i])+1);
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(!Hmap.containsKey(a[i]) )
			{
				System.out.print(a[i] + " ");
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,7,4,5};
		int brr[] = {2,3,1,0,5};
		NotDupes(arr,brr);
	}

}
