import java.util.*;
public class Prog3
{
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("apple");
		arr.add("ball");
		arr.add("cat");
	 	arr.add("dog");
		arr.add("eleven");
		printAll(arr);
	}
	static void printAll(List<String> arr)
	{
		Iterator iterator=arr.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}
}