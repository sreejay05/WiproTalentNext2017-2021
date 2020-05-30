import java.util.*;
public class Prog9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.next();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='*')
				break;
			System.out.print(s1.charAt(i));
		}
	}
}
