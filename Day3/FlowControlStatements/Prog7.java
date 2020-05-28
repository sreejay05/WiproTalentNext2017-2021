//7.Write a program to convert from upper case to lower case and vice versa of an alphabet and print
//the old character and new character as shown in example (Ex: a->A, M->m).

import java.util.Scanner;
public class Prog7 { 
public static void main(String[] args) { 
	Scanner s=new Scanner(System.in); 
	char ch=s.next().charAt(0);
	if (Character.isLowerCase(ch)) {
		System.out.println(ch+"->"+Character.toUpperCase(ch)); }
	else {
		System.out.println(ch+"->"+Character.toLowerCase(ch)); }
       }
}
