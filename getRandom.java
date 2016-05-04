import java.util.Random;

class TreeNode
{
	private int data;
	public TreeNode left;
	public TreeNode right;
	private int size=0;
	
	public TreeNode(int d)
	{
		this.data=d;
		size=1;
	}
}




public class getRandom {

	public TreeNode getRandom()
	{
		Random random = new Random();
		int leftsize = left==null? 0 : left.size();
		int index = random.nextInt(size);
		if(index<leftsize)
		{
			left.getRandom();
		}
		else if (index=leftsize)
		{
			return this;
		}
		else return right.getRandom;

	}
	public void inOrderInsert(int d)
	{
		if(d<=data)
		{
			if(left==null)
				left=new TreeNode(d);
			else
				left.inOrderInsert(d);
		}
		else
		{
			if(right==null)
				right = new TreeNode(d);
			else
				right.inOrderInsert(d);
		}
		size++;
	}
	
	public TreeNode find(int d)
	{
		if(d<=data)
		{
			if (this.data=d)
				return this;
			else
				return `left.find(d);
		}
		else
		{
			if(this.data= d)
				return this;
			else
				return right.find(d);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
