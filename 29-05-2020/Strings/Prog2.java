import java.util.*;
public class prog2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str1= s.nextLine();
		String str2= s.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char a = str1.charAt(str1.length()-1);
		char b = str2.charAt(0);
		if(a==b){
			for(int i=1;i<str2.length()-1;i++)
			str1 += str2.charAt(i);
		}
		else{
			str1.concat(str2);
		}
		System.out.println(str1);
	}
}
