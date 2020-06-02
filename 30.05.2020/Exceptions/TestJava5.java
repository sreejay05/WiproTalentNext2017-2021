import java.lang.*;
import java.util.Scanner;
public class TestJava5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			double d = div(a, b);
			System.out.println(d);
		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");
		}
	}
	public static double div(int a, int b) throws ArithmeticException{
		return a/b;
	}
}
