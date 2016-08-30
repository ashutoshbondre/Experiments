

public class PalindromeNum {
	
	public static boolean isPalin(int n)
	{	
		int x =cal(n);
		return (x==n);
	}
		public static int cal(int m)
		{
			if(m/10==0) return m;
		int quo=m/10;
		int c=quo;
		//System.out.print(c);
		int remaining = m%10;
		while (quo!=0)
		{
			 quo = quo/10;
			 remaining = remaining*10;
		}
		int last = remaining + cal(c);
		return last;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalin(12355321));
	}

}
