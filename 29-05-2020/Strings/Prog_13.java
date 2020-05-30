import java.util.*;
public class Prog_13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.next();int n1=s1.length();
		String s2 = s.next();int n2=s2.length();
		String s3 = "";
		for(int i=0;i<n1;i++){
			if(s1.charAt(i)==s2.charAt(0)&& i!=0)
				s3 += s1.charAt(i-1);
			if(s1.charAt(i)==s2.charAt(n2-1)&& i!=n1-1)
				s3 += s1.charAt(i+1);
		}
		System.out.print(s3);

	}
}
