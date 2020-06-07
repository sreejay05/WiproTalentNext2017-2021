import java.io.*;
import java.util.*;
class PalindromeOrNot
{
	public int isPalindrome(int input1)
	{
		int rev=0,n;
    		n=input1;
    		while(n!=0)
    		{
    	    		rev=rev*10+n%10;
    	    		n/=10;
    		}
		if(rev==input1)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
}
