import java.io.*;
import java.util.*;
class PalindromePossible
{
	public int isPalindromePossible(int input1)
	{
        ArrayList<Integer> a=new ArrayList<Integer>(5);
	ArrayList<Integer> b=new ArrayList<Integer>(5);
	int d,i,c=0;
	while(input1!=0)
	{
		d=input1%10;
		if(!a.contains(d))
		{
			a.add(d);
			i=a.indexOf(d);
			b.add(i, 1);
		}
		else
		{
			i=a.indexOf(d);
			int value = b.get(i); // get value
			value++; // increment value
			b.remove(i);
			b.add(i, value);
		}
		input1/=10;
	}
	for(int t:b)
	{
		if(t%2!=0)
		{
			c++;
		}
	}
	if(c<=1)
	{
		return 2;//returns 2 if it can be formed as palindrome number
	}
	else
	{
		return 1;
	}
		
	}
}
