import java.util.*;

class Tower
{
	private Stack<Integer> disks;
	private int index;
	public Tower(int i)
	{
		disks=new Stack<Integer>();
		index=i;
	}


public static void main(String args[])
{
	int n = 3;
	Tower towers[] = new Tower[n];
	for(int i =0;i<n;i++)
	{
		towers[i]=new Tower(i);
	}
	for(int i = n-1;i>=0;i--)
	{
		towers[0].add(i);
	}
	towers[0].moveDisks(n,towers[2],towers[1]);
}

public void add(int n)
{
	if(!disks.isEmpty() && disks.peek()<=n)
		System.out.println(" ERROR ");
	else
	{
		disks.push(n);
	}
}
public int index()
{
	return index;
}

public void moveDisks(int n,Tower destination,Tower buffer)
{
	if(n>0)
	{
	moveDisks(n-1,buffer,destination);
	moveTopto(destination);
	moveDisks(n-1,destination,this);
	}
}

public void moveTopto(Tower t)
{

	int value = disks.pop();
	t.add(value);
}
}









































/*

import java.util.*;
class Tower
{
	private Stack<Integer> disks;
	private int index;
	public Tower(int i)
	{
		disks=new Stack<Integer>();
		index=i;
	}






	public static void main(String[] args) 
	{
		int n = 3;
		
		Tower towers[] = new Tower[n];
		for (int i =0;i<n;i++ )
		{
			towers[i]=new Tower(i);
		}
		for(int i = n-1;i>=0;i--)
		{
			towers[0].add(i);
		}
		towers[0].moveDisks(n,towers[2],towers[1]);
	//  Origin.moveDisks(n,Destination,buffer);
	}
	
	public void moveDisks(int n ,Tower destination,Tower buffer)
	{
		if(n>0)
		{
			
		moveDisks(n-1,buffer,destination);
			moveTopto(destination);
			moveDisks(n-1,destination,this);
		}
	}
	
	
	public void add(int n)
	{
		if(!disks.isEmpty() && disks.peek()<n)
		{
			System.out.println("ERROR");
		}
		else
		{
			disks.push(n);
		}
	}
	public int index()
	{
		return index;
	}
	public void moveTopto(Tower t)
	{
		int value = disks.pop();
		t.add(value);
	}

}
*/