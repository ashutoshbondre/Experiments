
public class SelectionSort {

	public static void sort(Comparable []a)
	{
		int N = a.length;
		for(int i = 0; i <N ; i++)
		{
			int min = i;
			for(int j = i+1; j<N;j++)
			{
				if(less( a[j],a[min]))
					min=j;
					
			}
			exch(a,i,min);
		}	
	}
	public static boolean less(Comparable a, Comparable b)
	{
		return a.compareTo(b)<0;
	}
	
	public static void exch(Comparable a[],int i ,int j)
	{
		Comparable swap = a[i];
		a[i]=a[j];
		a[j]=swap;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] ={9,3,4,2,8,1,18 ,0, 5,23,6};
		sort(arr);
		String s [] = {"ashu", "arun","tejas","dfd","bondre"};
		sort(s);
		for(int i = 0;i <s.length;i++)
		{
			System.out.print(s[i]+ " ");
		}
		System.out.println();
		
	}

}
