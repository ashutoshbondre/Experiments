
public class QuickUnion {

	private int id [];
	private int size[];
	public  QuickUnion(int N)
	{
		id = new int [N];
		for(int i = 0; i <N; i++)
		{
			id[i]=i;
		}
	}
	public int root(int i)
	{
		while(i!= id[i])
			i=id[i];
			return i;
	}
	
	public boolean connected(int p, int q)
	{
		return(root(p)== root(q));
	}
	
	public void union(int p , int q)
	{
		int proot= root(p);
		int qroot = root(q);
		if(proot==qroot)
			return;
		if(size[proot]<size[qroot])
		{
			id[proot]=qroot;
			size[qroot]=size[qroot]+size[proot];
		}
		else
		{
			id[qroot]=proot;
			size[proot]=size[proot]+size[qroot];
		}
			
		id[proot]=qroot;
	}
	
	
}
