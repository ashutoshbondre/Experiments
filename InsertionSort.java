
public class InsertionSort {
		public static void sort(Comparable a[])
		{
			int N = a.length;
			for(int i =0; i <N;i++)
				for(int j=i;j>0;j--)
					if(less (a[j],a[j-1]))
					{
						exch(a,j,j-1);
					}
					else break;
		}
			
			//Alternative Solution
		//for(int i=0 ; i<N; i++)
			//{
				//for(int j=i+1; j<N; j++)
				//{
					//while(less(a[j],a[i]))
					//{
					//	exch(a,i,j);
					//}
				//}
			//}
		public static void exch(Comparable b[],int i ,int j)
		{
			Comparable temp = b[i];
			b[i]=b[j];
			b[j]=temp;
		}
		
		public static boolean less(Comparable a,Comparable b)
		{
			return a.compareTo(b) < 0;
		}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {9,7,4,6,8,2,1,0};
		sort(arr);
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "  ");
		}
	}

}
