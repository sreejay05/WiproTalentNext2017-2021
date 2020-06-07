import java.io.*;
import  java.util.*;
import java.lang.Math.*;

class SumLastDigits
{
  public int addLastDigits(int input1,int input2)
  {
    int sum=Math.abs(input1%10)+Math.abs(input2%10);
		return sum;
  }
}
