import java.io.*;
import java.util.*;
class PalindromeString
{
	public String isPalindrome(String input1)
	{
		String rev="";
		for(int i=input1.length()-1;i>=0;i--)
		{
			rev+=input1.charAt(i);
		}
		if(rev.equalsIgnoreCase(input1))
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
}
	
