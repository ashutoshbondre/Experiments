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
		
		public  Node reverse()
		{
			Node current = head;
			Node rev = null;
			
			while(current!=null)
			{
				Node next= current.next;
				current.next=rev;
				rev=current;
				current=next;
			}
			Node temp = rev;
			return temp;
			
			
		}
	
	}

public class ReverseA_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(3);
		n.add(4);
		n.add(45);
		n.add(1);
		n.add(9);
		n.add(67);
		n.add(10);
		n.add(7);
		n.print();
		System.out.println("\n");
		Node reversed= n.reverse();
		reversed.print();
		

	}

}
