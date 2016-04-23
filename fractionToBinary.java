
public class fractionToBinary {
	public static String binary(double num) 
	{
		if(num>=1 || num<=0)
			return "ERROR";
		StringBuilder ans = new StringBuilder();
		ans.append("0.");
		while(num>0)
		{
		double r = num*2;
		if(r>=1)
		{
			ans.append('1');
			num=r-1;
		}
		else
		{	
			ans.append('0');
			num=r;
		}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = binary(0.625);
		System.out.println(ans);

	}

}
