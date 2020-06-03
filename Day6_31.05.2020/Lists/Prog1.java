import java.util.*;
class Even
{
	public ArrayList<Integer> saveEvenNumbers(int N)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=2;i<=N;i++)
			if(i%2==0)
				a1.add(i);
		return a1;
	}
	ArrayList<Integer> a2=new ArrayList<Integer>();
	public ArrayList<Integer> printEvenNumbers(ArrayList<Integer> arr)
	{
		int temp;
		for(Integer i:arr)
		{
			temp=i*2;
			a2.add(temp);
			System.out.print(temp+" ");
		}
		return a2;
	}
	public int printEvenNumbers(int N)
	{
		int f=0;
		for(Integer i:a2){
			if(N==i)
				f=1;
		}
		if(f==1)
			return N;
		else
			return 0;
	}

}
public class Prog1
{
	public static void main(String[] args) {
		Even e=new Even();
		ArrayList<Integer> A1=e.saveEvenNumbers(25);
		ArrayList<Integer> A2=e.printEvenNumbers(A1);
		System.out.println("\nsearching element 8:"+e.printEvenNumbers(8));
	}
}