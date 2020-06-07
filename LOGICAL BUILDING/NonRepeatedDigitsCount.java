import java.io.*;
import java.util.*;
class NonRepeatedDigitsCount
{
	public int nrDigitCount(int input1)
	{
		ArrayList<Integer> a=new ArrayList<Integer>(5);
		int d;
		while(input1!=0)
		{
			d=input1%10;
			a.add(d);
			input1/=10;
		}
		for(int i=0;i<a.size();i++)
		{
			d=0;
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)==a.get(j))
				{
					a.remove(j);
					j--;
					d=1;
				}	
			}
			if(d==1)
			{
				a.remove(i);
				i--;
			}
		}
		return a.size();
	}
}
