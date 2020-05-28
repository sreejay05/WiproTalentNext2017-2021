//1.Write a program to check if a given number is Positive, Negative, or Zero.

import java.util.*;
public class Prog1 
{
    public static void main(String[] args) 
    {
        int N;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        N = s.nextInt();
        if(N == 0)
        {
	System.out.println(N + " is zero ");  
        }
        else if(N > 0)
        {
	 System.out.println(n+" is Positive");
        }
        else
        {
	System.out.println(n+" is Negative");
        }
    }
}
