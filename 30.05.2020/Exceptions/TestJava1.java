import java.lang.*;

import java.util.Scanner;

public class TestJava1{
	public static void main(String[] args){
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter an integer:");
			String str = s.next();
			int n = Integer.parseInt(str);
			int sq = n * n;
			System.out.println(sq);
		}
		catch (NumberFormatException e ){
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}
}
