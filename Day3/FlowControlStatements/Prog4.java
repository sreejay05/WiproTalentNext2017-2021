//4.Initialize two character variables in a program and display the characters in alphabetical order.

public class Prog4
{
	public static void main(String[] args) {
	    char a='s',b='e';
	    if(Character.compare(a,b)<0)
	        System.out.println(a+","+b);
	    else
	        System.out.println(b+","+a);
	}
}
