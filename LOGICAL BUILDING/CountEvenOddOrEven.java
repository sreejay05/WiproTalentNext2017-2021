import java.io.*;
import java.util.*;
Class CountEvenOddOrEven
{
	public int countEvens(int input1,int input2,int input3,int input4,int input5,Char* input6)
	{
		int arr[]={input1,input2,input3,input4,input5};
		int even=0,odd=0;
		for(int i=0;i<5;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
				
		}
		if(input6=="even")
		{
			return eve;
		}
		else
		{
			
			return odd;
		}
	}
}
