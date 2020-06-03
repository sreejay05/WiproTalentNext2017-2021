import java.util.*;
public class Prog4
{
	public static void main(String[] args) {
		List<Object> li=new MyArrayList<>();
		try
		{
		li.add(20);
		li.add(3.4);
		li.add(4.5f);
		li.add("string");//throws exception
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Iterator iterator=li.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
class MyArrayList<E> extends ArrayList<E>
{
	public boolean add(E e)
	{
		if(e instanceof Integer|| e instanceof Float||e instanceof Double)
		{
			super.add(e);
			return true;
		}
		else
		{
			throw new ClassCastException("only int, float or double are supported");
		}
	}
}