import java.lang.*;
import java.util.Scanner;
public class TestJava2{
	public static void main(String[] args){
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int n = s.nextInt();
			int[] a = new int[n];
			System.out.println("Enter the elements in the array");
			for(int i=0;i<n;i++)
				a[i]=s.nextInt();
			System.out.println("Enter the index of the array element you want to access");
			int x = s.nextInt();
			System.out.println("The array element at index " + x +" = "+a[x]);
			System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException e ){
			System.out.println(e);
		}
	}
}
