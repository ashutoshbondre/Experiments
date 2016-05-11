public class Shuffle {
	
	
	public static void shuffle(Object[] a)
	{
		int N = a.length;
		for (int i =0; i <N ;i ++)
		{
			int c =StdRandom.uniform(i+1);
			//System.out.print( c +" #");
			exch(a,i,c);
		}
		
	}
	public static void exch (Object a[],int i,int j)
	{
		Object temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {1,2,3,4,5,6,7,8,0};
		shuffle(arr);
		for(int i = 0;i<arr.length;i++)
		System.out.print(arr[i]+ " ");
	}

}
