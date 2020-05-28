public class Prog_18{
public static void main{
	int r;
	int n = Integer.parseInt(args[0]);
	int m=n; 
	int sum=0; 
	while(m!=0) 
	{ 
		r=m%10; 
		sum=sum*10+r; 
		m=m/10; 
	} 
	if(n==sum){
		System.out.println(n+" is a Palindrome"); }
	else {
		System.out.println(n+" is not a Palindrome");}
 } }
