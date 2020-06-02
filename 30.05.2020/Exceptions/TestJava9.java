import java.lang.*;
import java.util.Scanner;
public class TestJava9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int r = a%b;
			System.out.println(r);
		}
		catch (ArithmeticException e)
		{
			System.out.println("DivideByZeroException caught");
		}
		finally {
			System.out.println("Invalid finally block");
		}
	}

}
