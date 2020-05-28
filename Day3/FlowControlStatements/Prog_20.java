import java.util.Scanner;
public class Prog_20{ 
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	do{
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("Please enter an option:");
		int op = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		switch(op){
			case 1:System.out.println(a+b);break;	
			case 2:System.out.println(a-b);break;
		}
		System.out.println("To continue enter y or Y");
		char yes = s.next.chatAt(0);
	}while(yes=='y' || yes=='Y');
}}
