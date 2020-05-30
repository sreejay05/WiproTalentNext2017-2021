import java.util.*;
public class Prog_12{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sb.append(s.next());
		int n = s.nextInt();
		int k =sb.length()-n;
		sb.delete(0,k);
		for (int i=0;i<n;i++)
			System.out.print(sb);
	}
}
