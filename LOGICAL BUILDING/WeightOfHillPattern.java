import java.io.*;
import java.util.*;
class WeightOfHillPattern
{
  public int weightOfPattern(int input1,int input2,int input3)
  {
    int i,sum=0;
    for(i=1;i<=input1;i++)
    {
        sum+=input2*i;
        input2+=input3;

    }
    return sum;
  }
}
