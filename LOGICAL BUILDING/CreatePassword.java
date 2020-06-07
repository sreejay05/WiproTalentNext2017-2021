import java.io.*;
import java.util.*;
class CreatePassword
{
	public int createPass(int input1,int input2,int input3)
	{
		int min=input1,max=0,pass=0;
		int[] a={input1,input2,input3};
		for(int i=0;i<3;i++)
		{
			if(a[i]%10<min)
			{
				min=a[i]%10;
			}
			if(a[i]%10>max)
			{
				max=a[i]%10;
			}	
		}
		pass=min;
		min=999;
		for(int i=0;i<3;i++)
		{
			if((a[i]%100)/10<min)
			{
				min=(a[i]%100)/10;
			}
			if((a[i]%100)/10>max)
			{
				max=(a[i]%100)/10;
			}	
		}
		pass+=min*10;
		min=999;
		for(int i=0;i<3;i++)
		{
			if((a[i]%1000)/100<min)
			{
				min=(a[i]%1000)/100;
			}
			if((a[i]%1000)/100>max)
			{
				max=(a[i]%1000)/100;
			}	
		}
		pass+=min*100;
		pass+=max*1000;
		return pass;
	}
}
