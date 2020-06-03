public class DecimalConversion
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		System.out.println("Given Number"+args[0]);
		System.out.println("Binary equivalent:"+Integer.toBinaryString(n));
		System.out.println("Octal equivalent:"+Integer.toOctalString(n));
		System.out.println("Hexadedcimal equivalent:"+Integer.toHexString(n));
	}
}