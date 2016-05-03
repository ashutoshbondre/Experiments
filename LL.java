import java.util.*;
class Node
{
	int data;
	Node next;
	public Node Visited;
	
	public Node(int value)
	{
		data=value;
		
	}
}
class result
{
	public int size;
	public Node tail;
	public result(Node t , int s)
	{
		this.tail=t;
		this.size=s;
	}
	
}
public class LL {
	 Node head;
	 public LL(int item)
	 {
		 head = new Node(item);
	 }

	 public void add(int item)
	 {
		 Node temp = head;
		 while(temp.next!=null)
		 {
			temp=temp.next; 
		 }
		 temp.next=new Node(item);
	 }
	 public static void  print(LL a)
	 {
		 Node temp=a.head;
		 while(temp.next!=null)
		 {
			 System.out.print(temp.data + " --> ");
			 temp=temp.next;
		 }
		 System.out.print(temp.data);
		 
	 }
	 public static Node addLists(Node a,Node b, int carry)
		{
			if(a==null && b==null && carry==0)
			{
				return null;
			}
			Node result = new Node(0);
			int value = carry;
			if(a!=null)
			{
				value= value + a.data;
			}
			if(b!=null)
			{
				value=value+b.data;
			}
			result.data = value%10;
			if(a!=null || b!=null)
			{
				Node more = addLists(a==null? null:a.next, b==null? null:b.next,value>=10? 1:0);
				result.next=more;
			}
			return result;	
	}
	 public static void print(Node a)
	 {
		 Node temp=a;
		 while(temp.next!=null)
		 {
			 System.out.print(temp.data + " --> ");
			 temp=temp.next;
		 }
		 System.out.print(temp.data);
	 }
	 
	 class headTail
	 {
		 Node head;
		 Node tail;
		 public headTail(Node h , Node t)
		 {
			 head=h;
			 tail=t;
		 }
	 }
	 
	 public boolean isPalindrome(Node head)
	 {
		 headTail reversed = reverse(head);
		 Node reversedHead = reversed.head;
		 return isEqual(head,reversedHead);
	 }
	 headTail reverse(Node head)
	 {
		 return null;
	 }
	 
	 boolean isEqual(Node head, Node reversedHead)
	 {
		 Node temp1=head;
		 Node temp2=reversedHead;
		 while(temp1!=null && temp2!=null)
		 {
			 if(temp1.data!=temp2.data)
			 {
				return false; 
			 }
			 temp1=temp1.next;
			 temp2=temp2.next;
		 }
		 return temp1==null && temp2==null;
	 }
	 
	static boolean isitPalindrome(Node head)
	{
		Node slow=head;
		Node fast=head;
		Stack<Integer> values= new Stack<Integer>();
		while(fast!=null && fast.next!=null)
		{
			values.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null)
		{
			slow=slow.next;
		}
		while(slow!=null)
		{
			int ans= values.pop().intValue();
			if(ans!=slow.data)
				return false;
			slow=slow.next;	
		}
		return true;
	}
	 
	public static Node intersection(Node list1 , Node list2)
	{
		if(list1==null || list2==null)
			return null;
		
		result r1 = getTailandSize(list1);
		result r2= getTailandSize(list2);
		
		if(r1.tail!=r2.tail)
			return null;
		
		Node shorter= r1.size <r2.size ? list1:list2;
		Node longer = r1.size > r2.size ? list1:list2;
		int difference  = Math.abs(r1.size-r2.size);
		Node starting = getKthNode(longer, difference);
		
		while(starting!=shorter)
		{
			starting = starting.next;
			shorter=shorter.next;
		}
		return shorter;
		
	}
	public static  Node getKthNode(Node head, int diff)
	{
		Node temp = head;
		while(diff>0 && temp!=null)
		{
			temp=temp.next;
			diff--;
		}
		return temp;
	}
	
	
		
		public static result getTailandSize(Node head)
		{
			Node temp = head;
			int size = 0;
			while(temp.next!=null)
			{
				size++;
				temp=temp.next;
			}
			size++;
			Node tail = temp;
			return new result(tail,size);
			
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL mine = new LL(1);
		mine.add(2);
		mine.add(3);
		mine.add(4);
		mine.add(5);
		print(mine);
		System.out.println();
		LL yours = new LL(7);
		yours.add(8);
		yours.add(9);
		//yours.head.next=mine.head.next.next.next;
		yours.add(5);
		print(yours);
		System.out.println();
		Node ans = intersection(mine.head,yours.head);
		if(ans==null)
			System.out.println("NO INTERSECTION");
		else
			{System.out.println(ans.data);}
		System.out.println();
		
		
		

	}

}
