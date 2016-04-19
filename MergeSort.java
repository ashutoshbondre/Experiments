
public class MergeSort {
	
	
	public static void merge(Comparable a[],Comparable aux[],int low, int mid,int high)
	{
		
		//assert isSorted(a,mid+1,high);
		
		for (int i = low;i<=high;i++)
		{
			aux[i]=a[i];
		}
		int i = low;
		int j = mid+1;
		for(int k=low;k<=high;k++)
		{
			if(i>mid)
					a[k]=aux[j++];
			else if(j>high)
					aux[k]=a[i++];
			else if(less(aux[i],aux[j]))
					a[k]=aux[i++];
			else
					a[k]=aux[j++];
		}
				
	}
	public static boolean less(Comparable a,Comparable b)
	{
		return (a.compareTo(b)<0);
	}
	
	

	public static void sort(Comparable a[],Comparable aux[],int low,int high)
	{
		if(high<=low) return;
		
		int mid = low + (high-low)/2;
		sort(a,aux,low,mid);
		sort(a,aux,mid+1,high);
		merge(a,aux,low,mid,high);
		
		
	}
	 public static void sort(Comparable a[])
	 {
		 Comparable [] aux = new Comparable[a.length];
		 sort(a,aux,0,a.length-1);
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] ={12,4,5,8};
		//Integer a[]=new Integer[arr.length];
		sort(arr);
		for(int i =0;i<arr.length;i++)
		System.out.print(arr[i] + " ");
	}

}
