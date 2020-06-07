import java.io.*;
import java.util.*;
class EvenOrOddDigitSum
{
	public int eveOddSum(int input1,String input2)
	{
		int odd=0,even=0,d;
    		while(input1!=0)
   	 	{
        		d=input1%10;
        		if(d%2!=0)
        		{
           			odd+=d;
        		}
				else
				{
					even+=d;
				}
        		input1/=10;
    		}
    		if(input2.equalsIgnoreCase("even"))
			{
				return even;
			}
			else
			{
				return odd;
			}
	}
}
