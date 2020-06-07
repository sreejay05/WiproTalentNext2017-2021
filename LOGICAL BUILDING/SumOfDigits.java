import java.io.*;
import java.util.*;
class SumOfDigits
{
	public int sumDigit(int input1)
	{
		int sum=0;
		while(input1!=0)
		{
			sum+=input1%10;
			input1/=10;
		}
		while(sum/10!=0)
		{
			input1=sum;
			sum=0;
			while(input1!=0)
			{
				sum+=input1%10;
				input1/=10;
			}
		}
		return sum;//returns in single digit
	}
}
