import java.io.*;
import java.util.*;
class PrimesBetweenRange
{
	public int countPrimes(int input1,int input2)
	{
	int count=0,f=0;
	for(int i=input1;i<=input2;i++)
	{
		f=0;
      		for(int j=2;j<=i/2;j++)
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
	}
	return count;  
	}
}
    
