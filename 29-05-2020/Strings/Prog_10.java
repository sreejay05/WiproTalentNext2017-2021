import java.util.*;
import java.lang.*;
public class Prog_10 {
	public static void main(String[] args) {
		int i,j;
		Scanner s = new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		for(i=0,j=0;i<a.length()&& j<b.length();i++,j++){
			System.out.print(a.charAt(i));
			System.out.print(b.charAt(j));
		}
	}
}
