import java.util.*;
import java.lang.*;
public class Prog8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int count = s.nextInt();
		for(int i=0;i<count;i++){
			System.out.print(s1);
			if(i!=count-1)
				System.out.print(s2);
		}
	}
}
