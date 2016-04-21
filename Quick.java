
public class Quick {

	public static int partition(Comparable a[],int low,int high)
	{
		int i = low;
		int j = high +1;
		while(true)
		{
			while(less (a[++i],a[low]))
					if(i==high) break;
			
			while(less (a[low],a[--j]))
				if(j==low) break;
				
			if(i>=j) break;
			exch(a,i,j);		
		}
		exch(a,low,j);
		return j;
	}
	
	private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
        
    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
	
    public static void sort(Comparable a[])
    {
    	StdRandom.shuffle(a);
    	sort(a,0,a.length-1);
    }
	
    public static void sort(Comparable a[],int low,int high)
    {
    	if (high<=low) return;
    	int j = partition(a,low,high);
    	sort(a,low,j-1);
    	sort(a,j+1,high);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]={12,7,4,32};
		sort(a);
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
