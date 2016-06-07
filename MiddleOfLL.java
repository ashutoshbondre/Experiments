

class Node
	{
		public int data;
		public Node next;
		Node head =null;
		public Node(int d)
		{
			data=d;
			head=this;
		}
		
		public void add(int d)
		{
			if(head==null)
				head = new Node(d);
			else
			{
				Node temp = head;
				while(temp.next!=null)
					{temp=temp.next;}
				temp.next=new Node(d);
			}
		}
		public void print()
		{
			if(head==null)
				throw new IllegalArgumentException();
			else
			{
				Node temp=head;
				while(temp.next!=null)
				{
					System.out.print(temp.data + "->");
					temp=temp.next;
				}
				System.out.print(temp.data);
				
			}
			
		}
	
	}
 

public class MiddleOfLL {
	
	public static int findMid(Node head)
	{
		Node slow=head;
		Node fast = head;
		while(fast.next!=null && fast!=null)
		{
			if(fast.next.next==null) break;
			fast=fast.next.next;
			slow=slow.next;
			
		}
		return slow.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(3);
		n.add(4);
		n.add(45);
		//n.add(1);
		n.add(9);
		n.add(67);
		n.add(100);
		n.add(7);
		n.print();
		int ans=findMid(n);
		System.out.println(" \nMiddle Element: " + ans);
	}

}
