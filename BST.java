
public class BST <Key extends Comparable<Key>, Value>
{
	private Node root;
	public class Node
	{
		private Key key;
		private Value val;
		private Node left;
		private Node right;
		
		public Node(Key key, Value val)
		{
			this.key=key;
			this.val=val;
		}
		
	}
	
	public Value get(Key key)
	{
		Node x = root;
		while(x!=null)
		{
			int cmp = key.compareTo(x.key);
			if(cmp < 0) x=x.left;
			else if(cmp>0) x =x.right;
			else return x.val;
		}
		return null;
	}
	
	
	public void put(Key key,Value value)
	{
		root = put(root,key,value);
	}
		
	private Node put(Node x, Key key,Value val)
		{
			if(x==null) 
					return new Node(key,val);
			int cmp = key.compareTo(x.key);
			if(cmp <0)
				x.left=put(x.left,key,val);
			else if(cmp>0)
				x.right=put(x.right,key,val);
			else 
				x.val=val;
			return x;	
		}
	
	private Key floor(Key key)
	{
		Node x = floor(root,key);
		if (x==null) return null;
		return x.key;
	}
	 private Node floor(Node x, Key key)
	 {
		 if(x==null) return null;
		 int cmp = key.compareTo(x.key);
		 if(cmp==0) return x;
		 if(cmp<0)
			 return floor(x.left,key);
		 Node t =floor(x.right,key);
		 if(t==null) return x;
		 else return t;
		 
	 }
	
	private void DeleteMin()
	{
		Node x = DeleteMin(root);
	}
	
	private Node DeleteMin(Node k)
	{
		if(k.left==null)
			return k.right;
		k.left = DeleteMin(k.left);
		k.count = 1+ size(k.left) + size(k.right);
		return k;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
