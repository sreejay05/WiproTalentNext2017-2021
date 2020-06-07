import java.io.*;
import java.util.*;
class SecondWordUpper
{
  public String secondCaseChange(String input1)
  {
		String[] s=input1.split(" ");
		if(s.length<=1)
		{
			return "LESS";
		}
		String word=s[1].toUpperCase(); 
		return word;
	}
}
