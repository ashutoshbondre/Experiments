
public class IsPowerOf2 {

	public static boolean isPower(int n)
	{
		return ((n & n-1) ==0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPower(16));
	}

}
