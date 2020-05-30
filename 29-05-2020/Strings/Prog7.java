import java.util.*;
import java.lang.*;
public class Prog7{
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		Scanner s = new Scanner(System.in);
		sb.append(s.nextLine());
		if(sb.charAt(0)=='x')
			sb.deleteCharAt(0);
		if(sb.charAt(sb.length()-1)=='x')
			sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}
