import java.util.Arrays;

public class SecondHighest {
	public static void Shigh(int [] input)
	{
		Arrays.sort(input);
		int SecondHighest = input.length-2;
		System.out.println(input[SecondHighest]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,150,43,54,100,200};
		Shigh(arr);

	}

}
