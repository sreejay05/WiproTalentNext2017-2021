import java.io.*;
import java.util.*;
class UniqueDigitCount
{
	public int distinctDigitCount(int input1)
	{
		ArrayList<Integer> a=new ArrayList<Integer>(5);
		int count=0,d;
		while(input1!=0)
		{	
			d=input1%10;
			if(!a.contains(d))
			{
				a.add(d);
				count++;
			}
			input1/=10;
		}
		return count;
	}
}
