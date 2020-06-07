import java.io.*;
import  java.util.*;
Class Fibonacci
{
	public int Fibo(int input1)
	{
		int a=0,b=1,temp=0;
		for(int i=1;i<input1;i++)
		{
			temp=a+b;
			a=b;
			b=temp;
		}
		return a;
	}
}
