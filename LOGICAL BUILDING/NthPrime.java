import java.io.*;
import  java.util.*;
Class NthPrime
{
	public int isPrime(int input1)
	{
		int f=0,count=0,i=3,j;
		while(count<input1)
		{
			f=0;
			for(j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				count++;
			}
			i++;		
		}
		return i-1;
  }
}
		
