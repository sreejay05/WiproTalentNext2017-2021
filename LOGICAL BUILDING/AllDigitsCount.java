import java.io.*;
import java.util.*;
class AllDigitsCount
{
	public int digitCount(int input1)
	{
		int count=0;
    		while(input1!=0)
    		{
        		count++;
        		input1/=10;
    		}
    		return count;
	}
}
