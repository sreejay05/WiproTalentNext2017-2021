import java.io.*;
import java.util.*;
class EvenDigitsSum
{
	public int evenDigitAdd(int input1)
	{
		int sum=0,d;
    		while(input1!=0)
   	 	{
        		d=input1%10;
        		if(d%2==0)
        		{
           			sum+=d;
        		}
        		input1/=10;
    		}
    		return sum;
	}
}
