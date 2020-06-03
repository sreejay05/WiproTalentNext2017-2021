import java.util.*;
public class IntToBinary
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		String str=Integer.toBinaryString(n);
		int num=Integer.parseInt(str);
		String st=String.format("%08d",num);
		System.out.print(st);
	}
}