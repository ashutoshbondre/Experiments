
public class BinarySearch {
	public static int Search(int n[] , int toFind)
		{
			int low = 0;
			int high = n.length-1;
			while(low<=high)
			{
				int mid = low + (high-low) / 2;
				if(toFind<n[mid])
					high = mid-1;
				else if(toFind>n[mid])
				low=mid+1;
				else return mid;
			}
			return -1;
		}
	public static void main(String args[])
	{
		int b[] = {42,3,87,0,12,7,5};
		int ans = Search(b,0);
		System.out.println(ans);
	}
}
