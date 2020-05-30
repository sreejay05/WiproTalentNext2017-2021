import java.util.*;
public class Prog1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str1= s.next();
		str1 = str1.toLowerCase();
		String str2 = "";
		int n = str1.length();
		for(int i=n-1;i>=0;i--){
			str2 += str1.charAt(i);
		}
		if(str1.equals(str2)){
			System.out.println("The given string is a Palindrome.");
		}
		else{
			System.out.println("The given string is not a Palindrome.");
		}
	}
}
