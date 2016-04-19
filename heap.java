
public class heap <key extends Comparable<key>>{
	
		private key pq[];
	 	private int N;
	 	
	 	public heap(int capacity)
	 	{
	 		pq =(key[])new Comparable[capacity+1]; 
	 	}
	 public boolean isEmpty()
	 {
		 return N==0; 
	 }
	public void swim(int k)
	{
		while(k>1 && less(k/2,k))
		{
			exch(k,k/2);
			k=k/2;
		}
	}
	
	public void sink (int k)
	{
		while(2*k<=N)
		{
			int j=2*k;
			if(j<N && less(j,j+1)) j++;
			if(!less(k,j)) break;
			exch(j,k);
			k=j;
		}
	}
	public void insert(key x)
	{
		pq[++N]= x;
		swim(N);
	}
	
	public key delMax()
	{
		key max = pq[1];
		exch(1,N--);
		sink(1);
		pq[N++]=null;
				return max;
	}
	
	
	public void exch(Comparable a,Comparable b)
	{
		Comparable temp = a;
		a=b;
		b=temp;
	}
	public boolean less(Comparable a,Comparable b)
	{
		return a.compareTo(b)<0;
	}
	public static void main(String[] args) 
	{
		

	}

}
