import java.util.*;
public class TestJava4{
public static void main(String[] args) {
	int n = args.length;
	int sum=0;
	float avg=0;
	int[] a = new int[n];
	try{
	
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(args[i]);
			
		}
		for(int i=0;i<n;i++){
			sum += a[i];}
		avg = (float)sum/n;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
	catch (NumberFormatException e) {
		System.out.println("NumberFormatException");
	} 
	catch (ArithmeticException e) {
		System.out.println("ArithmeticException");
	} 
	catch (InputMismatchException e) {
		System.out.println("InputMismatchException");
	}
	
	}

}
